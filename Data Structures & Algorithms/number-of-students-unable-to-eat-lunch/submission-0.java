class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // Quantidade de estudantes
        int n = students.length;

        // Aqui teremos um array de 2 posições para contar quem quer 1 e quem quer 0
        int[] count = new int[2];

        for (int s : students) {
            count[s]++;
        }

        // Percorrer os sanduíches na ordem da pilha
        // Para cada sanduíche, verificar se ainda existe estudantes que quer ele
        int eaten = 0;
        
        for (int i = 0; i < n; i++) {
            int type = sandwiches[i];
            if (count[type] > 0) {
                count[type]--;
                eaten++;
            } else {
                break;
            }
        }

        return n - eaten;
    }
}
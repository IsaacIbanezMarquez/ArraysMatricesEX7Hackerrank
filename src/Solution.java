

import java.io.*;
import java.util.*;

// Repetits array:

/* En unes eleccions una empresa d'estadístiques d'opinió pregunta, a peu d'urna, de quin partit és cada votant. Es presenten 20 partits.

Es vol un programa capaç de saber quin d'aquests 20 partits ha obtingut més vots. Per tal de garantir l'anonimat es guarden els resultats amb nombres numèrics que van del 1 al 20. Per a fer-ho només ens interessa retornar el número (1,...,20) del partit amb més vots.

L'entrada ens dirà primer quanta gent ha anat a votar fins al moment i després es demana una successió de vots (nombres del 1 al 20). Es tracta de saber quin partit obté més vots.

Input Format

N: enter, indica el nombre de votants que participa de l'enquesta. Sucessió de N nombres corresponents als N vots.

Constraints

No n'hi ha.

Output Format

S'imprimeix el partit més votat.

Sample Input 0

30
4 3 1 1 1 1 1 2 3 5 4 2 6 4 5 3 3 2 3 2 5 1 1 1 1 1 1 1 1 1
Sample Output 0

1
 */



public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int NumVotantes = sc.nextInt();

        int[] lista = new int [20];


        for (int i = 0; i < NumVotantes; i++)
        {
            int voto = sc.nextInt();
            lista[voto-1] = lista [voto-1] +1;
        }
        int mesVotat = 0;
        for(int i = 0; i < 20; i++)
        {
            if (lista[i] > lista[mesVotat])
            {
                mesVotat = i;
            }
        }
        System.out.print(mesVotat+1);
    }
}

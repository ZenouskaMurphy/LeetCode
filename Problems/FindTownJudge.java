/* COMPLETED
In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.

If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.

 

Example 1:
Input: N = 2, trust = [[1,2]]
Output: 2

Example 2:
Input: N = 3, trust = [[1,3],[2,3]]
Output: 3

*/

public class FindTownJudge {
    public int findJudge(int N, int[][] trust) {
        int [] trusts = new int[N + 1];     //creating array for first line of adj_matrix
        int [] trusted_by = new int[N + 1]; // creating array for second line of adj_matrix
        
        for(int [] edge: trust){
            trusts[edge[0]]++;         //assigning first element of each trust array to trusts array 
            trusted_by[edge[1]]++;     //assigning second element of each trust array to trusted_by array
        }                              //counting instances of each number in both trusts and trusted_by array 
        
        for(int i=1; i<=N; i++){
            if(trusts[i] == 0 && trusted_by[i] == N-1){     //if trusts = 0 and trusted_by = N-1.. we have found judge
                return i;
            }
        }
        return -1;      //else there is no judge
    }
}

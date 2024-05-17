/*
Two soccer teams A and B play a series of matches over a period of time. In a match, the
winning team gets 3 points. If the match ends in a tie (draw) with both teams scoring same
goals, then both the teams get one point each. The losing team does not get any point.

The program must accept the goals scored by both team A and B in certain number of matches
and print the cumulative scores of team A and B separated by a space.

Input Format:
First line will contain the goals scored by team A, with the goal values separated by a space.
Second line will contain the goals scored by team B, with the goal values separated by a space.

Output Format:
First line will contain the scores of team A and B separated by a space.

Boundary Conditions:
The length of the input with the space separated goals is from 3 to 100.

Example Input/Output 1:
Input:
351
320

Output:
71

Explanation:
Team A drew the first match and hence both team A and B got one point each.
Team A won both matches two and three and hence got additional 6 points.
So the final score of team A is 7 and team B is 1.

*/

import java.util .*;
public class Hello {

public static void main(String[] args) {
  Scanner sc = new Scanner(System. in);
  String s1 = sc.nextLine();
  String s2 = sc.nextLine();
  String arr1[] = s1.split(" ");
  String arr2[] = s2.split(" ");
  int team1=0, team2=0;
  for(int i=0;i<arr1.length;i++){
    int score1 = Integer.parseInt(arr1[i]);
    int score2 = Integer.parseInt(arr2[i]);
    if(score1>score2){
      team1+=3;}
    else if(score1 == score2){
      team1+=1;
      team2+=1;}
    else if(score1<score2){
      team2+=3;}
    System. out.print(team1+" "+team2);
}
}

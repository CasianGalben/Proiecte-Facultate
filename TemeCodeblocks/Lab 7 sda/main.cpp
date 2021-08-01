#include <iostream>
#include <cstring>
#include <vector>
#include <cstring>
using namespace std;

void calculatorLPS(string pattern,vector<int> & lps, int m)
{
    int l=0;
    for(int i=1; i<m;)
    {
        if(pattern[i]==pattern[l])
        {
            l++;
            lps[i]=l;
            i++;
        }
        else
        {
            if(l!=0)
            {
                l=lps[l-1];
            }
            else i++;
        }
    }

}
void KMP(string pattern,string s, vector<int> & lps)
{
    int m=pattern.size();
    int n=s.size();
    calculatorLPS(pattern,lps,m);
    int i=0,j=0;
    while(i<n)
    {
        if(pattern[j]==s[i]){
            i++;j++;
        }
        if(j==m){
            cout<<"potrivire la: "<<i-j<<endl;
            j=lps[j-1];
        }
        else if(i<n&& pattern[j]!=s[i])
        {
            if(j!=0){j=lps[j-1];}
            else{i++;}
        }
    }
}
int main()
{
    string pattern="AABAA";
    string s="AABAACDBAABAAMNFAABAAKDFFAFF";
   vector<int> lps;
   for(int i=0;i<(int)pattern.size();i++)
   {
       lps.push_back(0);
   }
    KMP(pattern,s,lps);
    return 0;
}

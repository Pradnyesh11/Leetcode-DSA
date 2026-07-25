class Solution {
public:
    int trap(vector<int>& hei) {
        int n=hei.size();
        vector<int>pref(n),suff(n);
        pref[0]=hei[0],suff[n-1]=hei[n-1];
        int ans=0;
        for(int i=1;i<n;i++) pref[i]=max(pref[i-1],hei[i]);
        for(int i=n-2;i>=0;i--) suff[i]=max(suff[i+1],hei[i]);
        for(int i=0;i<n;i++){
            ans+=max(0,min(pref[i],suff[i])-hei[i]);
        }
        return ans;
    }
};
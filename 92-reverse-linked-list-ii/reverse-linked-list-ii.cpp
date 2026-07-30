/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverse(ListNode* head) {
        if(head == NULL) return NULL;
        ListNode* p = NULL;
        ListNode* c = head;
        ListNode* n = head->next;
        while(c->next != NULL) {
            c->next=p;
            p=c;
            c=n;
            n=n->next;
        }
        c->next=p;
        return c;
    }
    
    ListNode* reverseBetween(ListNode* head, int left, int right) {

        if(head == NULL || head->next==NULL || left==right) return head;
        ListNode* a = NULL;
        ListNode* b = head;
        ListNode* l=head;
        ListNode* r = NULL;
        for(int i = 1; i < left; i++) {
            a=l;
            l=l->next;
        }
        for(int i = 1; i <= right; i++) {
            r=b;
            b=b->next;
        }
        if(a != NULL) a->next=NULL;
        r->next=NULL;
        ListNode* h = reverse(l);
        l->next=b;
        if(a!=NULL) {
            a->next=h;
        }
        else {
            return r;
        }
        return head;
    }
};
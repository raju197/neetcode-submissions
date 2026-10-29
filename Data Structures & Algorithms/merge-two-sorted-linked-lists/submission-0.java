/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i = list1;
        ListNode j = list2;
        ListNode res = new ListNode();
        ListNode temp = res;
        while(i != null && j != null){
            if(i.val > j.val){
                temp.next = j;
                j = j.next;
            }else{
                temp.next = i;
                i = i.next;
            }
            temp = temp.next;
        }
        if(i!=null){
            temp.next = i;
            
        }
         if(j!=null){
            temp.next = j;
        }
        return res.next;

    
        
    }
}
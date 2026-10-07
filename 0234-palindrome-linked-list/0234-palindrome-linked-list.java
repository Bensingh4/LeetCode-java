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
    public boolean isPalindrome(ListNode head) {
        int count=0;
        ListNode curr= head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        int[] arr= new int[count];
        int i=0;
        curr=head;
        while(curr != null){
arr[i]=curr.val;
curr=curr.next;
i++;
        }
        int left=0;int right=count-1;
        while(left<=right){
            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
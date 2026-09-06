package com.task.leetcode;

import com.task.common.ListNode;

public class _25 {
    // 25. Reverse Nodes in k-Group
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode check = head;
        int count = 0;
        while (check != null){
            count++;
            check = check.next;
        }
        if (count < k) return head;
        ListNode cur = head;
        ListNode prev = null;
        int cnt = 0;
        while (cur != null && cnt<k){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            cnt++;
        }
        //反转之后head为尾节点，prev为头节点
        head.next = reverseKGroup(cur, k);
        return prev;
    }
}

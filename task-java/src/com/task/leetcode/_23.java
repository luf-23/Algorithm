package com.task.leetcode;

import com.task.common.ListNode;

public class _23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode now = new ListNode();
        int pos = -1;
        int minValue = Integer.MAX_VALUE;
        for (int i=0;i<lists.length;i++){
            if (lists[i] != null && lists[i].val < minValue){
                minValue = lists[i].val;
                pos = i;
            }
        }
        if (pos == -1) return null;
        if (lists[pos] != null) {
            now.val = lists[pos].val;
            lists[pos] = lists[pos].next;
        }
        now.next = mergeKLists(lists);
        return now;
    }
}

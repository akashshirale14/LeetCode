public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p3=null;
        ListNode p=null;
        int flag=0;
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        while(l1!=null || l2!=null){
            if(l1==null){
                p.next=l2;
                l2=l2.next;
                p=p.next;
                continue;
            }
            if(l2==null){
                p.next=l1;
                l1=l1.next;
                p=p.next;
                continue;
            }
           if(l1.val<=l2.val){
               if(flag==0){
                   p3=l1;
                   p=p3;
                   flag=1;
               }else{
                   p.next=l1;
                   p=p.next;
               }
               l1=l1.next;
           }else{
               if(flag==0){
                   p3=l2;
                   p=p3;
                   flag=1;
               }else{
                   p.next=l2;
                   p=p.next;
               }
               l2=l2.next;
               }
               }
            return p3;
           } 
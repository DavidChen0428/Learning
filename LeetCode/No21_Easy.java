package LeetCode;
// 取代陣列表示的鍊表
class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
}

public class No21_Easy {
    // 題目 Merge 2 sorted lists
    // 條件: 在未使用陣列的情況，使用ListNode來解答
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 建立一個新的ListNode裝入新的內容並傳輸出去
        ListNode answer=new ListNode(0);
        ListNode temp=answer;
        
        // 判斷list1和list2內還有沒有資料沒有處理的
        while(list1!=null && list2!=null){
            // 如果list1的資料比list2小 -> list1資料先排進去
            if(list1.val<list2.val){
                temp.next=list1;
                // list1 要記得換到下一層
                list1=list1.next;
            }else{
            //如果list2的資料比list1小 -> list2資料先排進去
                temp.next=list2;
                // list2 要記得換到下一層
                list2=list2.next;
            }
            // temp該層資料填好之後，也要記得換到下一層，不然資料會被覆蓋掉
            temp=temp.next;
        }
        // 如果其中一個list空掉了，那後面就給另一個list接續就好了
        if(list1!=null){
            temp.next=list1;
        }else if(list2!=null){
            temp.next=list2;
        }
        // 回傳時記得要從answer.next開始，不然會有一個0被包進去
        return answer.next;
    }


    // 將ListNode列印出來
    public static void printListNode(ListNode list){
        ListNode currentNode=list;
        while(currentNode!=null){
            System.out.print(currentNode.val+" ");
            currentNode=currentNode.next;
        }
    }

    public static void main(String[] args) {
        ListNode list1=new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode list2=new ListNode(1,new ListNode(2,new ListNode(4)));

        printListNode(mergeTwoLists(list1,list2));
    }
}

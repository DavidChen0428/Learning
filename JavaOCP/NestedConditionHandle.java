public class NestedConditionHandle {
    // 資料來源 : https://writingfoxx.com/?p=4826
    // 解決巢狀判別式的方法 :
    // 主要簡化巢狀判別的複雜程度，及簡化程式維護靈活度
    // 1. if-then-else + and
    // 2. GuardClause

    boolean isProcess=true;
    boolean isDone=true;
    boolean isPrint=true;

    // Exam1
    private String nestedCondition1() {
        String result = "";
        if (isProcess) {
            if (isDone) {
                return result = result.concat("process is true done is true");
            }
        }
        return result;
    }

    // Result -> if + and
    private String fixByIfThenElase1() {
        String result="";
        if(isProcess && isDone){
            return result = result.concat("process is true done is true");
        }
        return result;
    }

    // Result -> 衛述句
    private String fixByGuardClause1(){
        String result="";
        if(!isProcess){
            return result;
        }
        if(isDone){
            return result=result.concat("process is true done is true");
        }
        return result;
    }

    // Exam2 : 在if跟if之間有statement
    private String nestedCondition2() {
        String result = "";
        if (isProcess) {
            result=result.concat("process is true");
            if (isDone) {
                return result = result.concat("done is true");
            }
        }
        return result;
    }

    // Result -> if-then-else + and
    private String fixByIfThenElse2(){
        String result="";
        if(isProcess && !isDone){
            result=result.concat("process is true");
        }else if(isProcess && isDone){
            result=result.concat("process is true");
            result = result.concat("done is true");
        }
        return result;
    }

    // Result -> 衛述句
    private String fixByGuardClause2(){
        String result="";
        if(!isProcess){
            return result;
        }
        result=result.concat("process is true");
        if(isDone){
            return result=result.concat("done is true");
        }
        return result;
    }

    private String fixByGuardClauseWithAnd2(){
        String result="";
        if(isProcess && !isDone){
            return result=result.concat("process is true");
        }
        if(isProcess && isDone){
            result=result.concat("process is true");
            return result=result.concat("done is true");
        }
        return result;
    }

    // Exam3 外層產生相對應 else
    private String nestedCondition3() {
        String result = "";
        if (isProcess) {
            result=result.concat("process is true");
            if (isDone) {
                return result = result.concat("done is true");
            }
        }else{
            result=result.concat("process is not true");
        }
        return result;
    }

    // Result -> if-then-else + and
    private String fixByIfThenElse3(){
        String result="";
        if(isProcess && !isDone){
            result=result.concat("process is true");
        }else if(isProcess && isDone){
            result=result.concat("process is true");
            result=result.concat("Done is true");
        }else if(!isProcess){
            result=result.concat("process is true");
        }
        return result;
    }

    // Result -> 衛述句
    private String fixByGuardClause3WithAnd(){
        String result="";
        if(!isProcess){
            result=result.concat("process is not true");
        }
        if(isProcess && !isDone){
            result=result.concat("process is true");
        }
        if(isProcess && isDone){
            result=result.concat("process is true");
            return result = result.concat("done is true");
        }
        return result;
    }

    // Exam4 內層產生相對應else
    private String nestedCondition4() {
        String result = "";
        if (isProcess) {
            result=result.concat("process is true");
            if (isDone) {
                result = result.concat("done is true");
            }else{
                result=result.concat("done is not true");
            }
        }else{
            result=result.concat("process is not true");
        }
        return result;
    }

    // Result -> if-then-else + and
    private String fixByIfThenElse4(){
        String result="";
        if(isProcess && !isDone){
            result=result.concat("process is true");
            return result=result.concat("done is not true");
        }else if(isProcess && isDone){
            result=result.concat("process is true");
            return result=result.concat("done is true");
        }else if(!isProcess){
            result=result.concat("process is true");
        }
        return result;
    }

    // Result -> 衛述句
    private String fixByGuardClause4WithAnd() {
        String result="";
        if(!isProcess){
            result=result.concat("process is not true");
        }
        if(isProcess && isDone){
            result=result.concat("process is true");
            return result = result.concat("done is true");
        }
        if(isProcess && !isDone){
            result=result.concat("process is true");
            return result = result.concat("done is not true");
        }
        return result;
    }

    // Exam5 外層if的else加入其他動作
    private String nestedCondition5() {
        String result = "";
        if (isProcess) {
            result=result.concat("process is true");
            if (isDone) {
                result = result.concat("done is true");
            }else{
                result=result.concat("done is not true");
            }
        }else{
            result=result.concat("process is not true");
            if(isPrint){
                result=result.concat("print is true");
            }else{
                result=result.concat("print is not true");
            }
        }
        return result;
    }

    // Result if-then-else + and
    private String fixByIfThenElse5(){
        String result="";
        if(isProcess && !isDone){
            result=result.concat("process is true");
            return result=result.concat("done is not true");
        }else if(isProcess && isDone){
            result=result.concat("process is true");
            return result=result.concat("done is true");
        }else if(!isProcess && isPrint){
            result=result.concat("process is true");
            return result=result.concat("print is true");
        }else if(!isPrint && !isPrint){
            result=result.concat("process is true");
            return result=result.concat("print is not true");
        }
        return result;
    }

    // Result -> 衛述句
    private String fixByGuardClause5WithAnd() {
        String result="";
        if(!isProcess && isPrint){
            result=result.concat("process is not true");
            return result=result.concat("print is true");
        }
        if(!isProcess && !isPrint){
            result=result.concat("process is not true");
            return result=result.concat("print is not true");
        }
        if(isProcess && isDone){
            result=result.concat("process is true");
            return result = result.concat("done is true");
        }
        if(isProcess && !isDone){
            result=result.concat("process is true");
            return result = result.concat("done is not true");
        }
        return result;
    }
}

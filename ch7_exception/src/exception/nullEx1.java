package exception;

public class nullEx1 {

    public static void main(String[] args) {

        String str = null;
        // Null_Pointer_Exception:
        // System.out.println(str.length());

        Account accounts[] = new Account[5];

        // Null_Pointer_Exception
        for (Account account : accounts) {
            // 선택1. null 확인 후 처리하기(NullPointerException 피하기)
            if (account != null) {
                System.out.println(account.getAno());
            }
        }

        // 선택2.
        try {
            for (Account account : accounts) {
                System.out.println(account.getAno());
            }
        } catch (NullPointerException e) {
            e.printStackTrace(); // 어디서 에러났는지 알려줌.
            System.out.println(e.getMessage()); // print:
            // Cannot invoke "exception.Account.getAno()" because "account" is null

            System.out.println("입력을 확인해주세요");
        }

    }

}

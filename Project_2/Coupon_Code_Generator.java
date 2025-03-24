import java.util.Random;
import java.util.Scanner;

class CouponModel{
    String [][]userType={{"VIP","5%"},{"PREMIUM","10%"},{"NORMAL","15%"}};
}
class CouponView{
    String input;
    void userInput(){
        Scanner sc=new Scanner(System.in);
        input=sc.next().toUpperCase();
    }

    void displayDiscount(String [][]userType){
        for(int i=0;i<3;i++){
            if(userType[i][0].equals(input)){
                System.out.println("Discount: "+userType[i][1]+" OFF on your next purchase!");
                System.out.println("Valid Till: 31st December 2025");
            }
        }
    }
}
class CouponController{
    CouponModel m=new CouponModel();
    CouponView v=new CouponView();

    void CouponCodeGenerator(int length){
        System.out.println("Enter User Type (VIP / Premium / Normal): ");
        v.userInput();
        System.out.println("Congratulations! You have received a discount coupon.");
        Random r=new Random();
        String code="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<length;i++) {
            sb.append(code.charAt(r.nextInt(code.length())));
        }
        System.out.println("Coupon Code: "+sb);
        v.displayDiscount(m.userType);
    }
}

public class Coupon_Code_Generator {
    public static void main(String[] args) {
        CouponController c=new CouponController();
        c.CouponCodeGenerator(8);

    }
}

interface CouponValidator {
    void validateCoupon(String code);
    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

class ShoppingCart implements CouponValidator {
    public void validateCoupon(String code) {
        if (CouponValidator.isLengthValid(code)) {
            System.out.println(code + " -> Valid");
        } else {
            System.out.println(code + " -> Invalid");
        }
    }
}

public class CoupanValidator {
    public static void main(String[] args) {
        String[] coupons = {"SAVE10", "AB12", "WELCOME", "OFF", "DISC50"};
        ShoppingCart cart = new ShoppingCart();
        for (String code : coupons) {
            cart.validateCoupon(code);
        }
    }
}
public class Test {

    public static void main(String[] args) {

        // Basic Enum
        //ACTIVE
        System.out.println(UserStatus.ACTIVE);

        // Enum + instance
		//whois.arin.net
        System.out.println(WhoisRIR.ARIN.url());

        // enum + method + logic
        double result = Operation.PLUS.calculate(1, 2);
        System.out.println(result); //3.0

        // looping via enum
        for (UserStatus status : UserStatus.values()) {
            System.out.println(status);
        }

        // comparing enum
        WhoisRIR rir = WhoisRIR.APNIC;
        if(rir == WhoisRIR.APNIC) {
            System.out.println("This is APNIC : " + rir.url());
        }

        // enum switch case
        WhoisRIR rir2 = WhoisRIR.RIPE;

        switch (rir2) {
            case ARIN:
                System.out.println("This is ARIN");
                break;
            case APNIC:
                System.out.println("This is APNIC");
                break;
            case RIPE:
                System.out.println("This is RIPE");
                break;
            default:
                throw new AssertionError("Unknown RIR " + rir2);
        }

        //enum valueOf + uppercase
        Operation op = Operation.valueOf("times".toUpperCase());
        System.out.println(op.calculate(10, 3));
    }
}
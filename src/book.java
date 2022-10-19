public class book {
    String name;
    double cash;
    int kampt_sal_sparim;

    public book(String name, double cash, int kampt_sal_sparim) {
        this.name = name;
        this.cash = cash;
        this.kampt_sal_sparim = kampt_sal_sparim;
    }

    public boolean nigaakid(book other) {
        if (other.name == this.name)
            System.out.println("the name is the same");
        else
            System.out.println("the name is not the same");
        if (other.cash == this.cash)
            System.out.println("the cash is the same");
        else
            System.out.println("the cash is not the same");
        if (other.name == this.name&&other.cash == this.cash) {


            return true;

        }
    return false;

    }


}


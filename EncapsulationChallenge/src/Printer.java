public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex; //true - if it can print on two sides of a paper

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel < 0 ? 0 : (tonerLevel > 100 ? 100 : tonerLevel);
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount + tonerLevel > 100 || tonerAmount + tonerLevel < 0) return -1;
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {

        if (!duplex){
            System.out.println(pages + " pages will be printed");
            pagesPrinted = pages;
            return pages;
        };
        System.out.println((int) Math.ceil((double) pages /2) + " pages will be printed");
            pagesPrinted += (int) Math.ceil((double) pages /2);
            return (int) Math.ceil((double) pages /2);
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

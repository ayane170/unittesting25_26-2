package week_6.enum1.vraag4;

public enum TransactieType {
    OPNEMEN {
        public double voerTransactieUit(double huidigSaldo, double bedrag){
            if (huidigSaldo < bedrag){
                return 0;
            }else
                return huidigSaldo - bedrag;

        }
    },
    STORTEN{
        public double voerTransactieUit(double huidigSaldo, double bedrag){
            double saldo = huidigSaldo + bedrag;
            return  saldo;
        }
    };

   public  abstract double voerTransactieUit(double huidigSaldo, double bedrag);
}

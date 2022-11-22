public class AppCirculo {
    public static void main(String[] args) {
        double rc1 = 2.0;
        System.out.printf("Raio = %f / Circunferencia = %f / Area = %f\n", rc1,
                                                                           Circulo  .circunferencia(rc1),
                                                                           Circulo.area(rc1) );
        double rc2 = 3.0;
        System.out.printf("Raio = %f / Circunferencia = %f / Area = %f\n", rc2,
                                                                           Circulo.circunferencia(rc2),
                                                                           Circulo.area(rc2) );
        Circulo c1 = new Circulo(2.0);
        System.out.printf("Raio = %f / Circunferencia = %f / Area = %f\n", c1.obtemRaio(),
                                                                           c1.circunferencia(),
                                                                           c1.area() );
        Circulo c2 = new Circulo();
        c2.defineRaio( c2.obtemRaio() + 2.0 );
        System.out.printf("Raio = %f / Circunferencia = %f / Area = %f\n", c2.obtemRaio(),
                                                                           c2.circunferencia(),
                                                                           c2.area() );

        Circulo c3 = Circulo.comArea(2.0);
        System.out.printf("Raio = %f / Circunferencia = %f / Area = %f\n", c3.obtemRaio(),
                                                                           c3.circunferencia(),
                                                                           c3.area() );

        Circulo c4 = Circulo.comCircunferencia(5.0);
        System.out.printf("Raio = %f / Circunferencia = %f / Area = %f\n", c4.obtemRaio(),
                                                                           c4.circunferencia(),
                                                                           c4.area() );
    }
}
public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {
        Rueda[] ruedasSub = new Rueda[5];
        ruedasSub[0] = new Rueda("Yokohama", 16, 7.5);
        ruedasSub[1] = new Rueda("Yokohama", 16, 7.5);
        ruedasSub[2] = new Rueda("Yokohama", 16, 7.5);
        ruedasSub[3] = new Rueda("Yokohama", 16, 7.5);
        ruedasSub[4] = new Rueda("Yokohama", 16, 7.5);

        Persona conductorSubaru = new Persona("Luci", "Martinez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        subaru.setRuedas(ruedasSub);

        Rueda[] ruedasMaz = {new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5)};

        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);
        mazda.setRuedas(ruedasMaz);

        Rueda[] ruedasNissan = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5)};

        Persona bea = new Persona("Bea", "González");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.0, TipoMotor.DIESEL), new Estanque(50), bea, ruedasNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5)};

        Persona lalo = new Persona("Lalo", "Mena");
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.0, TipoMotor.DIESEL), new Estanque(50), lalo, ruedasNissan2);
        nissan2.setTipo((TipoAutomovil.PICKUP));

        Automovil.setColorPatente(Color.AZUL);
        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle() + "\n");
        System.out.println(mazda.verDetalle() + "\n");
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

        /*System.out.println("Conductor subaru: " + subaru.getConductor());
        System.out.println("Ruedas subaru: ");
        for (Rueda r: subaru.getRuedas()) {
            System.out.println(r.getFabricante() + ", arco: " + r.getAro() + ", ancho " + r.getAncho());
        }*/


    }
}

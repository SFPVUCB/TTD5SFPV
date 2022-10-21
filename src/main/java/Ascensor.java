public class Ascensor {

    private Character [][] ascensor = {{'3'},
            {'2'},
            {'1'}};

    private final int ASCENSOR_OCUPADO =1;

    public String verificar(String  verificando) throws Exception {
        return "1";
    }


    public String direccion(int x) throws Exception{
        verificarAscensor(x);

        return null;
    }

    private void verificarAscensor(int ascen) throws Exception{
        if(ascen < ASCENSOR_OCUPADO){
            throw new Exception(ascen+"Ascensor Ocupado");
        }else{
            System.out.println("Ascensor Libre");
        }
    }



}
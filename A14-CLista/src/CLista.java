public class CLista {
    public String cabeza;
    public CLista subLista; // cola
    public CLista(){
        this.cabeza = null;
        this.subLista = null;
    }
    // Insertar un elemento en la lista en la posicion indicada
    public void add(int index, String elemento){
        if ( index == 0 ) {
            if (this.cabeza == null) {
                this.cabeza = elemento;
            } else {
                // Guardamos los datos de la lista en uns lista temporal, por si acaso
                CLista lTemp = new CLista();
                lTemp.cabeza = this.cabeza;
                lTemp.subLista = this.subLista;
                this.cabeza = elemento;
                this.subLista = lTemp;
            }
        } else{
            if (this.subLista == null){
                // Inserta en la cabeza de la subLista
                this.subLista = new CLista();
                this.subLista.add(index-1,elemento);
            } else {
                this.subLista.add(index-1,elemento);
            }
        }
    }

    public String get(int index){
        if (index == 0){
            return this.cabeza;
        }else{
            return this.subLista.get(index - 1);
        }
    }

    public void _show(){
        if ( this.subLista == null ){ // Condicion de finalizacion
            System.out.println(this.cabeza + " )");
        } else {
            if (this.getSize() == 0 )
                System.out.print(this.cabeza+",");
            System.out.print(this.cabeza+",");
            this.subLista.show();
        }
    }

    public void show(){
        // tareita tienen que hacer que se vea bonito
        // ( Vladimir, Ilich, Ascue, lovon )
        if(this.getSize() == 0)
            System.out.print("( )");
        else
            System.out.print("( ");
        for (int i = 0; i < this.getSize(); i++) {
            if(i == this.getSize() - 1)
                System.out.print(this.get(i) + " )" );
            else
                System.out.print(this.get(i) + ", ");
        }
    }

    public int getSize(){
        int size = 0;
        if( this.subLista == null )
            if (this.cabeza == null)
                return size;
            else
                return size + 1;
        else
            return this.subLista.getSize() + 1;
    }

    public Boolean isEmpty(){
        if( this.cabeza == null && this.subLista == null)
            return true;
        else
            return false;
    }

    public void remove(int index){
        if (index == 0){
            this.cabeza = this.subLista.cabeza;
            this.subLista = this.subLista.subLista;
        }else{
            this.subLista.remove(index - 1);
        }
    }

    public void remove(String element){
        if (this.cabeza.equals(element)){
            if(this.subLista != null){
                this.cabeza = this.subLista.cabeza;
                this.subLista = this.subLista.subLista;
            }else{
                this.cabeza = null;
                this.subLista = null;
            }
        }else{
            if(this.subLista != null)
                this.subLista.remove(element);
        }
    }

    public int index(String element){
        return 0;
    }

    public Boolean exists(String element){

    }

}

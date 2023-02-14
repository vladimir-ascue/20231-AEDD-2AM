public class CPila {
    public String cabeza;
    public CPila subPila; // pila
    public CPila(){
        this.cabeza = null;
        this.subPila = null;
    }
    // Insertar un elemento en la pila en la posicion indicada
    public void add(int index, String elemento){
        if ( index == 0 ) {
            if (this.cabeza == null) {
                this.cabeza = elemento;
            } else {
                // Guardamos los datos de la pila en uns pila temporal, por si acaso
                CPila lTemp = new CPila();
                lTemp.cabeza = this.cabeza;
                lTemp.subPila = this.subPila;
                this.cabeza = elemento;
                this.subPila = lTemp;
            }
        } else{
            if (this.subPila == null){
                // Inserta en la cabeza de la subPila
                this.subPila = new CPila();
                this.subPila.add(index-1,elemento);
            } else {
                this.subPila.add(index-1,elemento);
            }
        }
    }

    public String get(int index){
        if (index == 0){
            return this.cabeza;
        }else{
            return this.subPila.get(index - 1);
        }
    }

    public void _show(){
        if ( this.subPila == null ){ // Condicion de finalizacion
            System.out.println(this.cabeza + " )");
        } else {
            if (this.getSize() == 0 )
                System.out.print(this.cabeza+",");
            System.out.print(this.cabeza+",");
            this.subPila.show();
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
        if( this.subPila == null )
            if (this.cabeza == null)
                return size;
            else
                return size + 1;
        else
            return this.subPila.getSize() + 1;
    }

    public Boolean isEmpty(){
        if( this.cabeza == null && this.subPila == null)
            return true;
        else
            return false;
    }

    public void remove(int index){
        if (index == 0){
            this.cabeza = this.subPila.cabeza;
            this.subPila = this.subPila.subPila;
        }else{
            this.subPila.remove(index - 1);
        }
    }

    public void remove(String element){
        if (this.cabeza.equals(element)){
            if(this.subPila != null){
                this.cabeza = this.subPila.cabeza;
                this.subPila = this.subPila.subPila;
            }else{
                this.cabeza = null;
                this.subPila = null;
            }
        }else{
            if(this.subPila != null)
                this.subPila.remove(element);
        }
    }

    public int index(String element){
        return 0;
    }

    public Boolean exists(String element){
        return null;
    }

}

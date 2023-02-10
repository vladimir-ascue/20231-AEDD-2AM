public class CCola {
    public String cabeza;
    public CCola subCola; // cola
    public CCola(){
        this.cabeza = null;
        this.subCola = null;
    }

    /***
     * Añade un elemento a la lista en la posicion index
     * @param index: int
     * @param elemento: String
     */
    public void add(int index, String elemento){
        if ( index == 0 ) {
            if (this.cabeza == null) {
                this.cabeza = elemento;
            } else {
                // Guardamos los datos de la lista en uns lista temporal, por si acaso
                CCola lTemp = new CCola();
                lTemp.cabeza = this.cabeza;
                lTemp.subCola = this.subCola;
                this.cabeza = elemento;
                this.subCola = lTemp;
            }
        } else{
            if (this.subCola == null){
                // Inserta en la cabeza de la subLista
                this.subCola = new CCola();
                this.subCola.add(index-1,elemento);
            } else {
                this.subCola.add(index-1,elemento);
            }
        }
    }

    public String get(int index){
        if (index == 0){
            return this.cabeza;
        }else{
            return this.subCola.get(index - 1);
        }
    }

    public void _show(){
        if ( this.subCola == null ){ // Condicion de finalizacion
            System.out.println(this.cabeza + " )");
        } else {
            if (this.getSize() == 0 )
                System.out.print(this.cabeza+",");
            System.out.print(this.cabeza+",");
            this.subCola.show();
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
        if( this.subCola == null )
            if (this.cabeza == null)
                return size;
            else
                return size + 1;
        else
            return this.subCola.getSize() + 1;
    }

    public Boolean isEmpty(){
        if( this.cabeza == null && this.subCola == null)
            return true;
        else
            return false;
    }

    public void remove(int index){
        if (index == 0){
            this.cabeza = this.subCola.cabeza;
            this.subCola = this.subCola.subCola;
        }else{
            this.subCola.remove(index - 1);
        }
    }

    public void remove(String element){
        if (this.cabeza.equals(element)){
            if(this.subCola != null){
                this.cabeza = this.subCola.cabeza;
                this.subCola = this.subCola.subCola;
            }else{
                this.cabeza = null;
                this.subCola = null;
            }
        }else{
            if(this.subCola != null)
                this.subCola.remove(element);
        }
    }

    public int index(String element){
        return 0;
    }

    public Boolean exists(String element){
        return null;
    }
}

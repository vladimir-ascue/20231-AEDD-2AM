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
}

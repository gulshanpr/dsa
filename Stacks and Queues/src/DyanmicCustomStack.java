public class DyanmicCustomStack extends CustomStack{
    public DyanmicCustomStack(){
        super();
    }

    public DyanmicCustomStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) throws StackException {

        if(super.isFull()){
            int[] temp = new int[data.length*2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        return super.push(item);
    }
}

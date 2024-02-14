package Services.Implements;

import Model.Toy;
import Services.ToyStoreImpl;

import java.io.File;
import java.util.List;

public class ToyServiceImpl implements ToyStoreImpl {
    private List<Toy> toyList;
    public ToyStoreImpl(){
        toyList = FileUtils.getContacts(new File(Toy.PATH_CONTACTS));


    }
}

package toyshop_InterCertGB;

import toyshop_InterCertGB.controllers.Controller;
import toyshop_InterCertGB.model.FileOperation;
import toyshop_InterCertGB.model.FileOperationImpl;
import toyshop_InterCertGB.model.Repository;
import toyshop_InterCertGB.model.RepositoryFileNew;
import toyshop_InterCertGB.views.ViewToy;

public class Main {
    public static void main(String[] args) {

        FileOperation fileOperation = new FileOperationImpl("toys.txt");
        Repository repository = new RepositoryFileNew(fileOperation);
        Controller controller = new Controller(repository);
        ViewToy view = new ViewToy(controller);
        view.run();
    }
}
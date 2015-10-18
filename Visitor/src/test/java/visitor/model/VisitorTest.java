package visitor.model;

import org.junit.Before;
import org.junit.Test;
import visitor.model.impl.CountVisitor;
import visitor.model.impl.Directory;
import visitor.model.impl.FSSizeVisitor;
import visitor.model.impl.File;

import static org.junit.Assert.assertEquals;

/**
 * Created by DENM on 18.10.2015.
 */
public class VisitorTest {
    CountVisitor countVisitor;
    FSSizeVisitor sizeVisitor;
    FSElement directory;
    @Before
    public void init(){
        countVisitor = new CountVisitor();
        sizeVisitor = new FSSizeVisitor();
        directory = new Directory("/");
        FSElement directory_1 = new Directory("dir_1");
        FSElement directory_2 = new Directory("dir_2");

        directory.addElement(directory_1);
        directory.addElement(directory_2);

        FSElement file_1 = new File("file_1", 1);
        FSElement file_2 = new File("file_2", 2);
        FSElement file_3 = new File("file_3", 1);
        FSElement file_4 = new File("file_4", 3);
        FSElement file_5 = new File("file_5", 4);

        directory.addElement(file_1);
        directory_1.addElement(file_2);
        directory_1.addElement(file_3);
        directory_2.addElement(file_4);
        directory_2.addElement(file_5);

        directory.buildFS();
    }

    @Test
    public void FSElementsCountTest(){

        directory.accept(countVisitor);
        assertEquals(8, countVisitor.getCount(), 0);
    }

    @Test
    public void FSElementsSizeTest(){
        directory.accept(sizeVisitor);
        assertEquals(11, sizeVisitor.getSize() ,0);
    }
}

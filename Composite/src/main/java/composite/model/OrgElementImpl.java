package composite.model;

import java.util.List;

/**
 * Created by dmakarov on 10/7/2015.
 */
public class OrgElementImpl implements OrgUnit {
    private String descr;

    public OrgElementImpl(String descr) {
        this.descr = descr;
    }

    @Override
    public String getDescr() {
        return descr;
    }

    @Override
    public void addChild(OrgUnit unit) {
        throw new UnsupportedOperationException("Operation not supported for element nodes");
    }

    @Override
    public void removeChild(OrgUnit unit) {
        throw new UnsupportedOperationException("Operation not supported for element nodes");
    }

    @Override
    public List<OrgUnit> getAllChilds() {
        throw new UnsupportedOperationException("Operation not supported for element nodes");
    }

    @Override
    public void generateOverallDescr() {
        System.out.println(descr);
    }
}

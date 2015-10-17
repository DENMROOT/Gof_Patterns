package composite.model;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmakarov on 10/7/2015.
 */
public class OrgUnitImpl implements OrgUnit {
    private String descr;
    private List<OrgUnit> childs;

    public OrgUnitImpl(String descr) {
        this.descr = descr;
        this.childs = new ArrayList<>();
    }

    @Override
    public String getDescr() {
        return descr;
    }

    @Override
    public void addChild(OrgUnit unit) {
        this.childs.add(unit);
    }

    @Override
    public void removeChild(OrgUnit unit) {
        childs.remove(unit);
    }

    @Override
    public List<OrgUnit> getAllChilds() {
        return ImmutableList.copyOf(childs);
    }

    @Override
    public void generateOverallDescr() {
        System.out.println(descr);
        for (OrgUnit child : childs) {
            child.generateOverallDescr();
        }
    }
}

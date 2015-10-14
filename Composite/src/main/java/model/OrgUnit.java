package model;

import java.util.List;

/**
 * Created by dmakarov on 10/7/2015.
 */
public interface OrgUnit {
    public String getDescr();
    public void addChild (OrgUnit unit);
    public void removeChild (OrgUnit unit);
    public List<OrgUnit> getAllChilds();
    public void generateOverallDescr();
}

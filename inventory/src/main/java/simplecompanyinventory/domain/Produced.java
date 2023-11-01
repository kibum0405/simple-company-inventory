package simplecompanyinventory.domain;

import java.util.*;
import lombok.*;
import simplecompanyinventory.domain.*;
import simplecompanyinventory.infra.AbstractEvent;

@Data
@ToString
public class Produced extends AbstractEvent {

    private String salesOrderNumber;
    private String salesPerson;
    private String status;
    private Object companyId;
    private Object salesType;
    private Object salesItems;
}

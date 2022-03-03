package fokus.wo.api.invdetail;

import java.util.ArrayList;
import java.util.Iterator;

public class InvDetailList {

	private Iterator<InvDetail> invDetailList;

	public Iterator<InvDetail> getInvDetailList() {
		if (null == invDetailList) {
			this.invDetailList = new ArrayList<InvDetail>().iterator();
		}
		return invDetailList;
	}

}

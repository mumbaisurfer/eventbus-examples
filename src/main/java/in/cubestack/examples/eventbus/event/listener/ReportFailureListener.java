package in.cubestack.examples.eventbus.event.listener;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import in.cubestack.examples.eventbus.event.ReportFailureEvent;

/**
 * Created by init5_0 on 5/18/2017.
 */
public class ReportFailureListener extends EventListener {

    @AllowConcurrentEvents
    @Subscribe
    public void onReportFailureEvent(ReportFailureEvent event) {

    }
}

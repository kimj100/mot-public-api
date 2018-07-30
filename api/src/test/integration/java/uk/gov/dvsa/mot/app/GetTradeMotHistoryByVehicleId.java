package uk.gov.dvsa.mot.app;

import org.junit.Test;

import uk.gov.dvsa.mot.trade.api.TradeException;
import uk.gov.dvsa.mot.trade.api.TradeServiceRequest;

import java.util.List;

import javax.ws.rs.container.ContainerRequestContext;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class GetTradeMotHistoryByVehicleId {
    private static TradeServiceRequest input = new TradeServiceRequest();

    private ContainerRequestContext createContext() {

        ContainerRequestContext ctx = new RequestContext();

        ctx.setMethod("TradeHandler");

        return ctx;
    }

    @Test
    public void testTradeHandler() {

        try {
            TradeServiceRequestHandler tradeServiceRequestHandler = new TradeServiceRequestHandler();
            ContainerRequestContext ctx = createContext();

            List<?> output = (List<?>) tradeServiceRequestHandler.getTradeMotTests(input.getVehicleId(), input.getNumber(),
                    input.getRegistration(), input.getDate(), input.getPage(), ctx).getEntity();

            if (output != null) {
                System.out.println(output.toString());
            }
        } catch (TradeException e) {
            e.printStackTrace();
        }
    }
}

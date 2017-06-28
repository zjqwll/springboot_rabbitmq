package rabbitmq.mq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import rabbitmq.mq.contract.queue.RabbitmqQueue;
import rabbitmq.mq.entity.ContractRabbitmq;
import rabbitmq.mq.entity.TenantRabbitmq;

/**
 * 
 * 【接收方service】
 *
 * @version 
 * @author Administrator  2017年6月28日 上午11:33:02
 *
 */
@Component
public class ReceiverService {

	@RabbitListener(queues = RabbitmqQueue.CONTRACE_SELF, containerFactory = "rabbitListenerContainerFactory")
    public void receiveContractQueue(ContractRabbitmq contract) {
        System.out.println("Received contract<" + new Gson().toJson(contract) + ">");
    }

    @RabbitListener(queues = RabbitmqQueue.CONTRACE_TENANT)
    public void receiveTenantQueue(TenantRabbitmq tenant) {
        System.out.println("Received Bar<" + new Gson().toJson(tenant) + ">");
    }
}
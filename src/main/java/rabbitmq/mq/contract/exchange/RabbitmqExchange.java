package rabbitmq.mq.contract.exchange;

/**
 * exchange交换机静态数据配置
 */
public interface RabbitmqExchange {
	/**
	 * 合同exchange
	 */
	final String CONTRACT_FANOUT = "CONTRACT_FANOUT";
	final String CONTRACT_TOPIC = "CONTRACT_TOPIC";
	final String CONTRACT_DIRECT = "CONTRACT_DIRECT";
}
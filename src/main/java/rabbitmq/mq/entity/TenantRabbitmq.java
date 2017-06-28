package rabbitmq.mq.entity;

/**
 * tenant消息载体,（实体类与表态配置）要保证发送方与接收方都能引用到，可打jar包
 */
public class TenantRabbitmq {
	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
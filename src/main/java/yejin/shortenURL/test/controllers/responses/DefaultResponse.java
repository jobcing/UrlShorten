package yejin.shortenURL.test.controllers.responses;

import org.apache.log4j.Logger;

/**
 * DefaultResponse class.
 * 
 * @author devetude
 */
public class DefaultResponse {
	private static final Logger LOG = Logger.getLogger(DefaultResponse.class.getSimpleName());

	private Status status;
	private Object data;
	private String msg;

	/**
	 * Status enum.
	 * 
	 * @author devetude
	 */
	public enum Status {
		SUCCESS, FAIL
	}

	/**
	 * Constructor.
	 */
	public DefaultResponse() {
		LOG.debug("DefaultResponse");

		this.status = Status.SUCCESS;
		this.data = null;
		this.msg = null;
	}

	/**
	 * Constructor.
	 * 
	 * @param status
	 */
	public DefaultResponse(final Status status) {
		LOG.debug("DefaultResponse");

		this.status = status;
		this.data = null;
		this.msg = null;
	}

	/**
	 * Constructor.
	 * 
	 * @param status
	 * @param msg
	 */
	public DefaultResponse(final Status status, final String msg) {
		LOG.debug("DefaultResponse");

		this.status = status;
		this.data = null;
		this.msg = msg;
	}

	/**
	 * Constructor.
	 * 
	 * @param data
	 */
	public DefaultResponse(final Object data) {
		LOG.debug("DefaultResponse");

		this.status = Status.SUCCESS;
		this.data = data;
		this.msg = null;
	}

	/**
	 * Constructor.
	 * 
	 * @param status
	 * @param data
	 * @param msg
	 */
	public DefaultResponse(final Status status, final Object data, final String msg) {
		LOG.debug("DefaultResponse");

		this.status = status;
		this.data = data;
		this.msg = msg;
	}

	/**
	 * Methods to get status.
	 * 
	 * @return
	 */
	public Status getStatus() {
		LOG.debug("getStatus");

		return status;
	}

	/**
	 * Methods to set Status.
	 * 
	 * @param status
	 */
	public void setStatus(final Status status) {
		LOG.debug("setStatus");

		this.status = status;
	}

	/**
	 * Methods to get data.
	 * 
	 * @return
	 */
	public Object getData() {
		LOG.debug("getData");

		return data;
	}

	/**
	 * Methods to set data.
	 * 
	 * @param data
	 */
	public void setData(final Object data) {
		LOG.debug("setData");

		this.data = data;
	}

	/**
	 * Methods to get message.
	 * 
	 * @return
	 */
	public String getMsg() {
		LOG.debug("getMsg");

		return msg;
	}

	/**
	 * Methods to set message.
	 * 
	 * @param msg
	 */
	public void setMsg(final String msg) {
		LOG.debug("setMsg");

		this.msg = msg;
	}
}
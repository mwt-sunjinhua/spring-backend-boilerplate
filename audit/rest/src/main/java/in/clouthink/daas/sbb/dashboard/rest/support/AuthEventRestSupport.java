package in.clouthink.daas.sbb.dashboard.rest.support;

import in.clouthink.daas.sbb.account.domain.model.SysUser;
import in.clouthink.daas.sbb.audit.domain.model.AuthEvent;
import in.clouthink.daas.sbb.audit.support.request.AuthEventQueryParameter;
import org.springframework.data.domain.Page;

import java.util.Date;

/**
 */
public interface AuthEventRestSupport {

	Page<AuthEvent> listAuthEventPage(AuthEventQueryParameter queryRequest);

	AuthEvent getAuthEventDetail(String id);

	void deleteAuthEventsByDay(String realm, Date day, SysUser user);

	void deleteAuthEventsBeforeDay(String realm, Date day, SysUser user);
}

package system;

import java.util.TimerTask;
import java.util.GregorianCalendar;
import colections.LinkList;

public class SystemDataHora extends TimerTask {
	
	GregorianCalendar clock;
	LinkList<Tarefa> observers;
	
	
	public SystemDataHora() {
		observers = new <Tarefa>LinkList();
	}
	
	public LinkList<Tarefa> getObservers() {
		return observers;
	}

	public void setObservers(LinkList<Tarefa> observers) {
		this.observers = observers;
	}

	
	
	@Override
	public void run() {
		
		while(true) {
			clock = new GregorianCalendar();
			observers.resetIndex();
			Tarefa a = (Tarefa)observers.next();
			while(observers.getIndex()!=null) {
				GregorianCalendar data = a.getPrevisao();
				if(clock.after(data)) {
					a.marcarPedente();
				}
				a = observers.next();
			}
		}
	}

	public GregorianCalendar getClock() {
		return clock;
	}

	public void setClock(GregorianCalendar clock) {
		this.clock = clock;
	}
	
	 
}

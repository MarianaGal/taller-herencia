import java.util.Date;

public class Alumno extends Person {
	
	private int idAlumno;
	private float gpa;
	public String carrera;
	public String titulo;
	private int anoGraduacion;
	

	public Alumno(String firstName, String middleName, String lastName, Date dateOfBirth) {
		super(firstName, middleName, lastName, dateOfBirth);
		
	}


	public int getIdAlumno() {
		return idAlumno;
	}


	public float getGpa() {
		return gpa;
	}


	public String getCarrera() {
		return carrera;
	}


	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}


	public String getTitulo() {
		return titulo;
	}



	public int getAnoGraduacion() {
		return anoGraduacion;
	}

	

}

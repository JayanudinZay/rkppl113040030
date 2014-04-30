package pertemuan7;

public class Nilai {

	private Mahasiswa mhs;
	private Matakuliah mk;
	private double nilai;
	private String grade;
	private double ipk;
	private String alamat;
	

	public Nilai() {

	}

	
	public String getAlamat() {
		return alamat;
	}


	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}


	public Nilai(Mahasiswa mhs, Matakuliah mk, double nilai) {
		this.mhs = mhs;
		this.mk = mk;
		this.nilai = nilai;
	}

	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Mahasiswa getMhs() {
		return mhs;
	}

	public void setMhs(Mahasiswa mhs) {
		this.mhs = mhs;
	}

	public Matakuliah getMk() {
		return mk;
	}

	public void setMk(Matakuliah mk) {
		this.mk = mk;
	}

	public double getNilai() {
		return nilai;
	}

	public void setNilai(double nilai) {
		this.nilai = nilai;
	}
	

	public double getIpk() {
		return ipk;
	}

	public void setIpk(double ipk) {
		this.ipk = ipk;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return mhs.getNrp()+" - "+mk.getNamaMatkul()+" - "+nilai;
	}
}

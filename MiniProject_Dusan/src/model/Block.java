package model;

public class Block implements java.io.Serializable {
	private String block;
	
	public Block() {}

	public Block(String block) {
		this.block = block;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	@Override
	public String toString() {
		return block;
	}
	
	
}

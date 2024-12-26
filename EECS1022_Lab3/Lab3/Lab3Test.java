import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

class Lab3Test {

	@Test
	void printStars1() {
		String expected = "*";
		assertEquals("Failed printStars1",expected, Lab3.printStars(1));
	}
	@Test
	void printStars2() {
		String expected = "**\n-*";
		assertEquals("Failed printStars2",expected, Lab3.printStars(2));
	}
	@Test
	void printStars3() {
		String expected = "***\n-**\n--*";
		assertEquals("Failed printStars3",expected, Lab3.printStars(3));
	}
	@Test
	void printStars4() {
		String expected = "****\n-***\n--**\n---*";
		assertEquals("Failed printStars4",expected, Lab3.printStars(4));
	}
	@Test
	void expand1() {
		String expected = "2*100 + 3*10 + 7";
		assertEquals("Failed expand1", expected, Lab3.expand(237, 3));
	}
	@Test
	void expand2() {
		String expected = "4*1000 + 6*100 + 6*10 + 5";
		assertEquals("Failed expand2", expected, Lab3.expand(4665, 4));
	}
	@Test
	void expand3() {
		String expected = "Invalid";
		assertEquals("Failed expand3", expected, Lab3.expand(-665, 3));
	}
	@Test
	void expand4() {
		String expected = "Invalid";
		assertEquals("Failed expand4", expected, Lab3.expand(665, -3));
	}
	@Test
	void getSeqStat1() {
		String expected = "{[<10>: 10, 10]; [<10, 15>: 25, 150]}";
		assertEquals("Failed getSeqStat1", expected, Lab3.getSeqStat(10, 5, 2));
	}
	@Test
	void getSeqStat2() {
		String expected = "{[<4>: 4, 4]; [<4, 10>: 14, 40]; [<4, 10, 16>: 30, 640];"
				+ " [<4, 10, 16, 22>: 52, 14080]; [<4, 10, 16, 22, 28>: 80, 394240]}";
		assertEquals("Failed getSeqStat2", expected, Lab3.getSeqStat(4, 6, 5));
	}
	@Test
	void getSeqStat3() {
		String expected = "{[<20>: 20, 20]; [<20, 15>: 35, 300]; [<20, 15, 10>: 45, 3000]}";
		assertEquals("Failed getSeqStat3", expected, Lab3.getSeqStat(20, -5, 3));
	}
	@Test
	void getSeqStat4() {
		String expected = "{[<-5>: -5, -5]; [<-5, -1>: -6, 5]; [<-5, -1, 3>: -3, 15];"
				+ " [<-5, -1, 3, 7>: 4, 105]}";
		assertEquals("Failed getSeqStat4", expected, Lab3.getSeqStat(-5, 4, 4));
	}
	@Test
	void seqInterleaving1() {
		String expected = "<1, 10, 3, 20, 30, 40>";
		assertEquals("Failed getSeqStat2", expected, Lab3.seqInterleaving(1, 2, 2, 10, 10, 4));
	}
	@Test
	void seqInterleaving2() {
		String expected = "<3, 9, 4, -1>";
		assertEquals("Failed getSeqStat2", expected, Lab3.seqInterleaving(3, 5, 1, 9, -5, 3));
	}
	@Test
	void seqInterleaving3() {
		String expected = "<-5, 9, 0, 4, 5, -1, 10>";
		assertEquals("Failed getSeqStat2", expected, Lab3.seqInterleaving(-5, 5, 4, 9, -5, 3));
	}
	@Test
	void seqInterleaving4() {
		String expected = "<9, 3, 4, -1>";
		assertEquals("Failed getSeqStat2", expected, Lab3.seqInterleaving(9, -5, 3, 3, 5, 1));
	}

}
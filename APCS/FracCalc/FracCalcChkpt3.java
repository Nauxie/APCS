public class FracCalcChkpt3 {

	public static void main(String[] args) {
		System.out.println(produceAnswer("1_1/2 + 5/4"));
	}

	public static String produceAnswer(String calc) {
		String splitUp[] = calc.split(" ");
		String finalAnswer = "445"; // assigns recognition value to return string

		if (true) { // chooses between regular method or EC method
			String a = "0";
			String b = "0";
			String c = "1";
			String splitUpNum1Whole[] = splitUp[0].split("_");
			a = splitUpNum1Whole[0];

			if (splitUp[0].contains("_")) {
				a = splitUpNum1Whole[0];
				if (splitUpNum1Whole[1].contains("/")) {
					String splitUpNum1Frac[] = splitUpNum1Whole[1].split("/");
					b = splitUpNum1Frac[0];
					c = splitUpNum1Frac[1];
				}
			}
			if (splitUpNum1Whole[0].contains("/")) {
				String splitUpNum1Frac[] = splitUpNum1Whole[0].split("/");
				a = "0";
				b = splitUpNum1Frac[0];
				c = splitUpNum1Frac[1];
			}
			String d = "0";
			String e = "0";
			String f = "1";

			String splitUpNum2Whole[] = splitUp[2].split("_");
			d = splitUpNum2Whole[0];

			if (splitUp[2].contains("_")) {
				d = splitUpNum2Whole[0];
				if (splitUpNum2Whole[1].contains("/")) {
					String splitUpNum2Frac[] = splitUpNum2Whole[1].split("/");
					e = splitUpNum2Frac[0];
					f = splitUpNum2Frac[1];
				}
			}
			if (splitUpNum2Whole[0].contains("/")) {
				String splitUpNum2Frac[] = splitUpNum2Whole[0].split("/");
				d = "0";
				e = splitUpNum2Frac[0];
				f = splitUpNum2Frac[1];
			}

			int iA = Integer.parseInt(a);
			int iB = Integer.parseInt(b);
			int iC = Integer.parseInt(c);
			int iD = Integer.parseInt(d);
			int iE = Integer.parseInt(e);
			int iF = Integer.parseInt(f);
			if (splitUp[1].equals("+")) { // ADDITION SEQUENCE
				if (iC == iF) { // COMMON DENOMINATOR SEQUENCE
					int iNum = 0;
					int iWhole = iA + iD;
					if (a.startsWith("-") && !(d.startsWith("-"))) {
						iNum = iB - iE;
					} else if (d.startsWith("-") && !(a.startsWith("-"))) {
						iNum = iE - iB;
					} else {
						iNum = iB + iE;
					}

					if (iNum > iC) {
						iWhole = iWhole + (iNum / iC);
						iNum = iNum % iC;
						if (iC % iNum != 0 || iNum != 0) {
							if (iNum == 0) {
								String stringWhole = Integer.toString(iWhole);
								finalAnswer = stringWhole;
							} else {
								String stringWhole = Integer.toString(iWhole);
								String stringNum = Integer.toString(iNum);
								String stringDen = Integer.toString(iC);
								finalAnswer = stringWhole + "_" + stringNum + "/" + stringDen;
							}

						}

					} else {

						if (iWhole == 0) {
							int i = iC;
							while (iNum % i != 0 || iC % i != 0) {
								i--;

							}
							if (i != 1) {
								iNum = iNum / i;
								iC = iC / i;
								if (iNum == iC) {
									finalAnswer = "1";
								} else {
									String stringNum = Integer.toString(iNum);
									String stringDen = Integer.toString(iC);
									finalAnswer = stringNum + "/" + stringDen;
								}

							} else {

								String stringNum = Integer.toString(iNum);
								String stringDen = Integer.toString(iC);
								finalAnswer = stringNum + "/" + stringDen;

							}
						} else if (iNum == 0) {
							String stringWhole = Integer.toString(iWhole);
							finalAnswer = stringWhole;

						} else {
							String stringWhole = Integer.toString(iWhole);
							String stringNum = Integer.toString(iNum);
							String stringDen = Integer.toString(iC);
							finalAnswer = stringWhole + "_" + stringNum + "/" + stringDen;

						}
					}

				} else {
					if (iA != 0 || iD != 0) {
						int iWhole = iA + iD;
						int LCD = iC * iF;
						iB = iB * iF;
						iE = iE * iC;
						int iNum = 0;
						if (a.startsWith("-") && !(d.startsWith("-"))) {
							iNum = iB - iE;
						} else if (d.startsWith("-") && !(a.startsWith("-"))) {
							iNum = iE - iB;
						} else if (d.startsWith("-") && a.startsWith("-")) {
							iNum = iB + iE;
						} else {
							iNum = iB + iE;
						}
						int iDen = LCD;
						if (Math.abs(iNum) < iDen) {
							int i = iDen;
							while (iNum % i != 0 || iDen % i != 0) {
								i--;

							}
							if (i != 1) {
								iNum = iNum / i;
								iDen = iDen / i;
								finalAnswer = iWhole + "_" + iNum + "/" + iDen;
							} else {
								finalAnswer = iWhole + "_" + iNum + "/" + iDen;
							}

						} else if (Math.abs(iNum) > iDen) {
							if (a.startsWith("-") && !(d.startsWith("-"))) {
								iWhole = iWhole - (iNum / iDen);
							} else if (d.startsWith("-") && !(a.startsWith("-"))) {
								iWhole = -iWhole + (iNum / iDen);
							} else if (d.startsWith("-") && a.startsWith("-")) {
								iWhole = iWhole - (iNum / iDen);
							} else {
								iWhole = iWhole + (iNum / iDen);
							}
							iNum = iNum % iDen;
							int i = iDen;
							while (iNum % i != 0 || iDen % i != 0) {
								i--;

							}
							if (i != 1) {
								iNum = iNum / i;
								iDen = iDen / i;
								finalAnswer = iWhole + "_" + iNum + "/" + iDen;
							} else {
								finalAnswer = iWhole + "_" + iNum + "/" + iDen;
							}

						} else if (iNum == iDen) {
							iWhole = iWhole + 1;
							String stringWhole = Integer.toString(iWhole);
							finalAnswer = stringWhole;

						}

					} else {
						int iWhole = 0;
						int LCD = iC * iF;
						iB = iB * iF;
						iE = iE * iC;
						int iNum = iB + iE;
						int iDen = LCD;
						if (iNum < iDen) {
							int i = iDen;
							while (iNum % i != 0 || iDen % i != 0) {
								i--;

							}
							if (i != 1) {
								iNum = iNum / i;
								iDen = iDen / i;
								finalAnswer = iWhole + "_" + iNum + "/" + iDen;
							} else {
								finalAnswer = iWhole + "_" + iNum + "/" + iDen;
							}

						} else if (iNum > iDen) {
							iWhole = iWhole + iNum / iDen;
							iNum = iNum % iDen;
							int i = iDen;
							while (iNum % i != 0 || iDen % i != 0) {
								i--;

							}
							if (i != 1) {
								iNum = iNum / i;
								iDen = iDen / i;
								finalAnswer = iWhole + "_" + iNum + "/" + iDen;
							} else {
								finalAnswer = iWhole + "_" + iNum + "/" + iDen;
							}

						}

					}

				}
			} else if (splitUp[1].equals("-")) { // SUBTRACTION SEQUENCE
				if (iC == iF) {
					int iNum = 0;
					int iWhole = iA - iD;
					if (a.startsWith("-") && !(d.startsWith("-"))) {
						iNum = -iB - iE;
					} else if (!(a.startsWith("-")) && d.startsWith("-")) {
						iNum = iB + iE;
					} else if (a.startsWith("-") & d.startsWith("-")) {
						iNum = -iB + iE;
					} else {
						iNum = iB - iE;
					}

					if (Math.abs(iNum) < iC) {
						int i = iC;
						while (iNum % i != 0 || iC % i != 0) {
							i--;
						}
						if (i != 1) {
							iNum = iNum / i;
							iC = iC / i;
						}
						if (iWhole == 0 && iNum == 0) {
							finalAnswer = 0 + "";
						} else if (iNum == 0 && iWhole != 0) {
							finalAnswer = iWhole + "";

						} else if (iWhole == 0 && iNum != 0) {
							finalAnswer = iNum + "/" + iC;
						} else {
							finalAnswer = iWhole + "_" + Math.abs(iNum) + "/" + iC;
						}
					} else if (Math.abs(iNum) >= iC) {

						iWhole = iWhole + (iNum / iC);
						iNum = iNum % iC;
						int i = iC;
						while (iNum % i != 0 || iC % i != 0) {
							i--;
						}
						if (i != 1) {
							iNum = iNum / i;
							iC = iC / i;
						}
						if (iWhole == 0 && iNum == 0) {
							finalAnswer = 0 + "";
						} else if (iNum == 0 && iWhole != 0) {
							finalAnswer = iWhole + "";

						} else if (iWhole == 0 && iNum != 0) {
							finalAnswer = iNum + "/" + iC;
						} else {
							finalAnswer = iWhole + "_" + Math.abs(iNum) + "/" + iC;
						}

					}

				} else {
					if (iA != 0 || iD != 0) {
						int iWhole = iA - iD;
						int LCD = iC * iF;
						iB = iB * iF;
						iE = iE * iC;
						int iNum = 0;
						if (a.startsWith("-") && !(d.startsWith("-"))) {
							iNum = -iB - iE;
						} else if (!(a.startsWith("-")) && d.startsWith("-")) {
							iNum = iB + iE;
						} else if (a.startsWith("-") & d.startsWith("-")) {
							iNum = -iB + iE;
						} else {
							iNum = iB - iE;
						}
						int iDen = Math.abs(LCD);
						int impropNum = iWhole * iDen + iNum;
						if (Math.abs(impropNum) > iDen) {
							iWhole = impropNum / iDen;
							iNum = (impropNum % iDen);
							int i = iDen;
							while (iNum % i != 0 || iDen % i != 0) {
								i--;
							}
							if (i != 1) {
								iNum = iNum / i;
								iDen = iDen / i;
							}
							if (iWhole == 0 && iNum == 0) {
								finalAnswer = 0 + "";
							} else if (iNum == 0 && iWhole != 0) {
								finalAnswer = iWhole + "";

							} else if (iWhole == 0 && iNum != 0) {
								finalAnswer = iNum + "/" + iDen;
							} else {
								finalAnswer = iWhole + "_" + Math.abs(iNum) + "/" + iDen;
							}

						} else if (Math.abs(impropNum) < iDen) {
							int i = iDen;
							while (impropNum % i != 0 || iDen % i != 0) {
								i--;
							}
							if (i != 1) {
								impropNum = impropNum / i;
								iDen = iDen / i;

							}
							finalAnswer = impropNum + "/" + iDen;

						} else if (Math.abs(impropNum) == iDen) {
							if (impropNum < 0) {
								finalAnswer = "-1";
							} else {
								finalAnswer = "1";
							}
						}

					} else {
						int iWhole = 0;
						int LCD = iC * iF;
						iB = iB * iF;
						iE = iE * iC;
						int iNum = 0;
						if (a.startsWith("-") && !(d.startsWith("-"))) {
							iNum = -iB - iE;
						} else if (!(a.startsWith("-")) && d.startsWith("-")) {
							iNum = iB + iE;
						} else if (a.startsWith("-") & d.startsWith("-")) {
							iNum = -iB + iE;
						} else {
							iNum = iB - iE;
						}
						int iDen = Math.abs(LCD);
						if (Math.abs(iNum) > iDen) {
							iWhole = iNum / iDen;
							iNum = (iNum % iDen);
							int i = iDen;
							while (iNum % i != 0 || iDen % i != 0) {
								i--;
							}
							if (i != 1) {
								iNum = iNum / i;
								iDen = iDen / i;
							}
							if (iWhole == 0 && iNum == 0) {
								finalAnswer = 0 + "";
							} else if (iNum == 0 && iWhole != 0) {
								finalAnswer = iWhole + "";

							} else if (iWhole == 0 && iNum != 0) {
								finalAnswer = iNum + "/" + iDen;
							} else {
								finalAnswer = iWhole + "_" + iNum + "/" + iDen;
							}

						} else if (Math.abs(iNum) < iDen) {
							int i = iDen;
							while (iNum % i != 0 || iDen % i != 0) {
								i--;
							}
							if (i != 1) {
								iNum = iNum / i;
								iDen = iDen / i;

							}
							finalAnswer = iNum + "/" + iDen;

						} else if (Math.abs(iNum) == iDen) {
							if (iNum < 0) {
								finalAnswer = "-1";
							} else {
								finalAnswer = "1";
							}
						}

					}

				}

			} else if (splitUp[1].equals("*")) { // MULTIPLICATION SEQUENCE
				if ((iA == 0 && iB == 0) || (iD == 0 && iE == 0)) {
					finalAnswer = "0";
				} else {
					int improperNum1 = 0;
					int improperNum2 = 0;
					if (a.startsWith("-")) {
						improperNum1 = iA * iC - iB;
					} else {
						improperNum1 = iA * iC + iB;
					}
					if (d.startsWith("-")) {
						improperNum2 = iD * iF - iE;
					} else {
						improperNum2 = iD * iF + iE;
					}

					int iNum = improperNum1 * improperNum2;
					int iDen = iC * iF;
					if (Math.abs(iNum) > iDen) {
						int iWhole = iNum / iDen;
						iNum = iNum % iDen;
						int i = iDen;
						while (iNum % i != 0 || iDen % i != 0) {
							i--;
						}
						if (i != 1) {
							iNum = iNum / i;
							iDen = iDen / i;
							if (iNum == 0) {
								finalAnswer = iWhole + "";
							} else {
								finalAnswer = iWhole + "_" + Math.abs(iNum) + "/" + iDen;
							}
						} else {
							if (iNum == 0) {
								finalAnswer = iWhole + "";
							} else if (iWhole == 0) {
								finalAnswer = iNum + "/" + iDen;
							} else {
								finalAnswer = iWhole + "_" + Math.abs(iNum) + "/" + iDen;
							}
						}
					} else if (Math.abs(iNum) == iDen) {
						finalAnswer = "1";
					} else {
						iNum = iNum % iDen;
						int i = iDen;
						while (iNum % i != 0 || iDen % i != 0) {
							i--;
						}
						iNum = iNum / i;
						iDen = iDen / i;
						finalAnswer = iNum + "/" + iDen;
					}
				}
			} else if (splitUp[1].equals("/")) { // DIVISION SEQUENCE
				if ((iA == 0 && iB == 0) || (iD == 0 && iE == 0)) {
					finalAnswer = "0";
				} else {
					int improperNum1 = 0;
					int improperNum2 = 0;
					if (a.startsWith("-")) {
						improperNum1 = iA * iC - iB;
					} else {
						improperNum1 = iA * iC + iB;
					}
					if (d.startsWith("-")) {
						improperNum2 = iD * iF - iE;
					} else {
						improperNum2 = iD * iF + iE;
					}
					int iNum = improperNum1 * iF;
					int iDen = iC * improperNum2;
					if (Math.abs(iNum) > iDen) {
						int iWhole = iNum / iDen;
						iNum = iNum % iDen;
						int i = iDen;
						while (iNum % i != 0 || iDen % i != 0) {
							i--;
						}
						if (i != 1) {
							iNum = iNum / i;
							iDen = iDen / i;
							if (iNum == 0) {
								finalAnswer = iWhole + "";
							} else {
								if (iWhole == 0) {
									finalAnswer = -iNum + "/" + Math.abs(iDen);
								} else {
									finalAnswer = iWhole + "_" + Math.abs(iNum) + "/" + Math.abs(iDen);
								}

							}
						} else {
							if (iNum == 0) {
								finalAnswer = iWhole + "";
							} else if (iWhole == 0) {
								finalAnswer = iNum + "/" + iDen;
							} else {
								finalAnswer = iWhole + "_" + Math.abs(iNum) + "/" + Math.abs(iDen);
							}
						}
					} else if (Math.abs(iNum) == iDen) {
						finalAnswer = "1";
					} else {
						iNum = iNum % iDen;
						int i = iDen;
						while (iNum % i != 0 || iDen % i != 0) {
							i--;
						}
						iNum = iNum / i;
						iDen = iDen / i;
						finalAnswer = iNum + "/" + Math.abs(iDen);
					}
				}
			}
		} else { // EXTRA CREDIT

		}
		return finalAnswer;
	}
}

import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        File dir = new File(".");

        String source = dir.getCanonicalPath() + File.separator + "src\\Input.txt";
        String dest = dir.getCanonicalPath() + File.separator + "src\\Output.txt";

        File fin = new File(source);
        FileInputStream fis = new FileInputStream(fin);
        BufferedReader in = new BufferedReader(new InputStreamReader(fis));

        FileWriter fstream = new FileWriter(dest, false);
        BufferedWriter out = new BufferedWriter(fstream);

        String aLine = null;

        while ((aLine = in.readLine()) != null)
        {
            aLine = aLine.toUpperCase();

            String[] operations = aLine.split(" ");

            if(operations.length == 0)
            {
                String str = "00";
                out.write(str);
                out.newLine();
            }

            else
            {
                switch (operations[0]) {
                    case "LDA": {
                        String str = "04 \n" + operations[1];
                        out.write(str);
                        out.newLine();
                        break;
                    }

                    case "STA": {
                        String str = "09 \n" + operations[1];
                        out.write(str);
                        out.newLine();
                        break;
                    }

                    case "MOV": {
                        switch (operations[1]) {
                            case "B,": {
                                String str = "0E";
                                out.write(str);
                                out.newLine();
                                break;
                            }
                            case "ACC,": {
                                String str = "0F\n" + operations[2];;
                                out.write(str);
                                out.newLine();
                                break;
                            }
                        }
                        break;
                    }

                    case "ADC": {
                        switch (operations[1]) {
                            case "B": {
                                String str = "12";
                                out.write(str);
                                out.newLine();
                                break;
                            }
                            default: {
                                String str = "13 \n" + operations[1];
                                out.write(str);
                                out.newLine();
                                break;
                            }
                        }
                        break;
                    }

                    case "SBB": {
                        String str = "18 \n" + operations[1];
                        out.write(str);
                        out.newLine();
                        break;
                    }

                    case "OUT": {
                        String str = "1D";
                        out.write(str);
                        out.newLine();
                        break;
                    }

                    case "PUSH": {
                        String str = "1E";
                        out.write(str);
                        out.newLine();
                        break;
                    }

                    case "POP": {
                        String str = "21";
                        out.write(str);
                        out.newLine();
                        break;
                    }

                    case "AND": {
                        String str = "24";
                        out.write(str);
                        out.newLine();
                        break;
                    }

                    case "OR": {
                        String str = "25\n" + operations[1];
                        out.write(str);
                        out.newLine();
                        break;
                    }
                    case "ORI": {
                        String str = "2A\n" + operations[1];
                        out.write(str);
                        out.newLine();
                        break;
                    }
                    case "NOT": {
                        String str = "2D";
                        out.write(str);
                        out.newLine();
                        break;
                    }
                    case "XCHG": {
                        String str = "2E";
                        out.write(str);
                        out.newLine();
                        break;
                    }

                    case "CMP": {
                        String str = "31";
                        out.write(str);
                        out.newLine();
                        break;
                    }
                    case "TEST": {
                        String str = "32";
                        out.write(str);
                        out.newLine();
                        break;
                    }
                    case "ROL": {
                        String str = "33";
                        out.write(str);
                        out.newLine();
                        break;
                    }

                    case "RCL": {
                        String str = "34";
                        out.write(str);
                        out.newLine();
                        break;
                    }

                    case "JMP": {
                        String str = "36\n" + operations[1];
                        out.write(str);
                        out.newLine();
                        break;
                    }
                    case "JNZ": {
                        String str = "39\n" + operations[1];
                        out.write(str);
                        out.newLine();
                        break;
                    }
                    case "CLC": {
                        String str = "3A";
                        out.write(str);
                        out.newLine();
                        break;
                    }
                    case "CLS": {
                        String str = "3B";
                        out.write(str);
                        out.newLine();
                        break;
                    }
                    case "HLT": {
                        String str = "3C";
                        out.write(str);
                        out.newLine();
                        break;
                    }
                    case "NOP": {
                        String str = "3D";
                        out.write(str);
                        out.newLine();
                        break;
                    }
                    default: {
                        String str = operations[0];
                        out.write(str);
                        out.newLine();
                        break;
                    }
                }
            }
        }

        in.close();
        out.close();
    }
}

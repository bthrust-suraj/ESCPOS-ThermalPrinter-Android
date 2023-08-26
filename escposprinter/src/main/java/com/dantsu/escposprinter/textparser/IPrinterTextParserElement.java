package com.bthrust.escposprinter.textparser;

import com.bthrust.escposprinter.EscPosPrinterCommands;
import com.bthrust.escposprinter.exceptions.EscPosConnectionException;
import com.bthrust.escposprinter.exceptions.EscPosEncodingException;

public interface IPrinterTextParserElement {
    int length() throws EscPosEncodingException;
    IPrinterTextParserElement print(EscPosPrinterCommands printerSocket) throws EscPosEncodingException, EscPosConnectionException;
}

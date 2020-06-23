DIR *.* /S/ON/B>LIST.TXT

DIR 显示某个文件夹下的内容
/s    列出源文件夹下包含子文件下的所有文件
/o[n/-n]  按字母顺序或按文件名顺序/反向显示
/b    只列出文件名称，而不列出文件大小，日期等信息
>  创建文件

dir C:\Users\benju\git\HotKeyHook\*.*/S/ON/B > C:\Users\benju\git\teapot-pga\output\HotKeyHook_LIST.TXT
实验一：
C:\tools\cloc\cloc-1.86.exe --list-file=C:\Users\benju\git\teapot-pga\output\HotKeyHook_LIST.TXT C:\Users\benju\git\dbjocr
      73 text files.
      30 unique files.
     413 files ignored.

github.com/AlDanial/cloc v 1.86  T=4.13 s (4.4 files/s, 267.9 lines/s)
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Bourne Shell                    11             67            180            292
C++                              1             38             49            174
XML                              2              0              0            157
Perl                             1             19             30             65
C/C++ Header                     2              4              6             24
Markdown                         1              0              0              1
-------------------------------------------------------------------------------
SUM:                            18            128            265            713
-------------------------------------------------------------------------------

d:\prj\cloc>
实验二：
C:\tools\cloc\cloc-1.86.exe C:\Users\benju\git\dbjocr --list-file=C:\Users\benju\git\teapot-pga\output\HotKeyHook_LIST.TXT
      73 text files.
      30 unique files.
     413 files ignored.

github.com/AlDanial/cloc v 1.86  T=0.40 s (44.7 files/s, 2749.5 lines/s)
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Bourne Shell                    11             67            180            292
C++                              1             38             49            174
XML                              2              0              0            157
Perl                             1             19             30             65
C/C++ Header                     2              4              6             24
Markdown                         1              0              0              1
-------------------------------------------------------------------------------
SUM:                            18            128            265            713
-------------------------------------------------------------------------------

d:\prj\cloc>
结论：--list-file的指定优先于<file(s)/dir(s)/git hash(es)>的指定

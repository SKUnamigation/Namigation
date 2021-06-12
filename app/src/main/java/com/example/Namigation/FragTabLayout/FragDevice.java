package com.example.Namigation.FragTabLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.Namigation.R;

public class FragDevice extends Fragment {
    private View view;
    CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8, cardView9, cardView10;

    public static FragDevice newinstance() {
        FragDevice fragDevice = new FragDevice();
        return fragDevice;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.frag_device, container, false);

        cardView1 = (CardView) view.findViewById(R.id.CV1);
        cardView2 = (CardView) view.findViewById(R.id.CV2);
        cardView3 = (CardView) view.findViewById(R.id.CV3);
        cardView4 = (CardView) view.findViewById(R.id.CV4);
        cardView5 = (CardView) view.findViewById(R.id.CV5);
        cardView6 = (CardView) view.findViewById(R.id.CV6);
        cardView7 = (CardView) view.findViewById(R.id.CV7);
        cardView8 = (CardView) view.findViewById(R.id.CV8);
        cardView9 = (CardView) view.findViewById(R.id.CV9);
        cardView10 = (CardView) view.findViewById(R.id.CV10);

        final Intent intent = new Intent(Intent.ACTION_VIEW);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://adcr.naver.com/adcr?x=GwZS96Y9f3/IZ9OQ81zFj////w==ktPVnnBjxN1g5doJXjnMRT/juaveSgvl5MyGoeEcOOxGpcYA5+3qcxt3BOR3nI/JQH7T+115mJvpopeZYRnfNnGOvhzLwbAYxVw8So9CMfdHVmfcES3DpN09DXDDs9gpmNfet5J4cA/8/llB3FZQ7YCpx624gYn2QeIjHWQ5kLdfndzTc2vo780y0l1PVSyAjR+UMapz2LESZrIWgTaOetM2jQyVUw/AwSUwg586YfZaSsYHgwBTihxFXa/AzUCM4O66zLZkKvZNoAUI8SujbDRjYTiXKOV5HzHwojtuk1rouHiYj1kLT45IRwjwKyXdoM3SrknedPpAJ6a64MXq96XHi+R5sTnPMAGPAKjGw6V4HPPrAP/jeVHnojMWM5Yvx7+79+fOS5NmuVtbMC3hb5mq1aqn61LLdwc6XsnG+DyVpHr/t85R9bU7JVvAmd1dPGehM5o3lL2D+caA9T8nh5tMLvezO1dwJ6zfDCbvtliwxE+FjknCeCvaNHembS/9NecFOKYLiQsTNfHlRRGoEihYZYAgLX73jMX69Zha3rdNk4rsVoW+eelhlUbGo/ntfEUjLxTlHB0VhoQ1nRMXZYMNo8CDWm7DVI8sHHaxLbvW7ntwAwxlDebL0oz5i3CWwHpyDSEQ9BHps3Bo8Ym23y9oLpNJreJDyTVA+XMMlG95x9qmCoyPMQaX7VTgsn2TZn0tEv3Gfx8yyW1LiOjGEt2dO4+wCnq10zo0b65kTD9B0AmqKnD7qdlkfI86UJmWnXrPY2MVAUDpDdzEzMm7iYAZV0N/M0iuauR1wWc5905R5Gi2dq/SLfqjI6NR+83NHcXpbUK4JqKuTHmYgs/P2mw=="));
                startActivity(intent);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://adcr.naver.com/adcr?x=QJCvck/qQwjh/tFQuzjQ8v///w==kQPm6qTHiicWGdK0/2pYWScTzZRDE2s8Uyt6wIxBydBMSHIxYYidMbWod/Y8vkrKBYP4Ew3jJ1E6AH/pYbPwrFVIimgAlr61KrAFeNJtIX453W7HZdLgxIdf/NBw1gqeXtMChO+QLyfbHRjjhFBjXQ7Is5qR2pW2vYCW0xvYdxoo0KmlLk+JnRHiQmFSH3UPCs9VQVUsn1Cs1GpxpnCmUnS4pvyVVzfQJh0VJCQ3y+pNMOhU6dO0At37MG8ZsVhXXQrqRdZFhWW9G7Gh8YBnVewfgeKXdfITze3o/MDKkFEuhvq2tJwyPIUXkWu5V/1qBktMYgiRS2WU/AoCctauhqf1johEG5dVGjaG4zLo3vqB/VN+UNAluqFmAFjj5l6+QWx7OLS8gOf40cSUVY339NVK4KQMl9EMJXj+UUqmlZEwDFXizQJA7P4vWS9QEq6SdCjpLd9B/qwRnuEiEDlA/G1Csk3TqY7gTFzylRBmbOMW55GNxauhSw85OOaAREPA0UcEUnt8pqP1FXrBONnjSOa+03bGspQxO7KnRbT4qN6W/oLK3ogb7r5F/2bgL+kBko4y2irUCfQ1qIac2weV4MgtymB9dIBinTq5ej3DMc6rzT4WlTMADISR489WSEY7jfpFwRgq3bPENXtE4uMtKHT2La4CkY6DOlk/T0wMf/pPnmibLtSg2sN7ZN3QO5mJUlegjwevDfuXXap/Z6RX2qf6YbkFRdUJSAQEmYb6c+0SqRjQmVwmnGMgX4VaX5VRQ35PdVHV7ZIV5s5GubzjL2jbBe0wptITbOX4jvfwCdxFQhspyr3fNFChChQsyV1D4Cb6jQmRY1FGICLuVne5DLeWBqjmXinZYU8m6e+oS4P0="));
                startActivity(intent);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://adcr.naver.com/adcr?x=lroqhW9hfdfhC8v/0Orq1v///w==k2XWkfluzEW8ktQROA/5YaIiEAEprm+wcQnJ17VuuGW613SKgupF6SnvNtDGyrnUk3xDipY1r4ulH4xIm7P8YsKO/pk8kmHgVF/IGU70DfCydbI+DiOkE+pH9EjBtPkMnalAQbNKh9QgaNagxUNOZ4rtbOBdQ7VSNDesxQDlZVJuS5R0abuCwWrs0rH+8XZGNX9cE18Ntf9shkCpNBSs3nkr+2y+sQrmcGPJIArvpOAvLib1MbnmSxkt5CfLMAa3Qx3pXhOl2BGsC5Ce1d/hxmcd4/+3x/qI6Ba/CP3vuJre6o7ymUFGR1V718SKM6jrmLQagY73QkZl3yBTzgJRQkdQ6wHBsmduG8EGXW9nzfWQH7WCPJIoZdmYSRAfI6xwpqX9oP1EcJcFNmPhUrxb3/oKHSxOiWahh3KcuMgzF3aQ79g3naGxtFEYLB2nttr3JQ2XsuDrjs/m0eRfMeXA9ZwO0B3AMDgvoDiWqkQlLA4+T71dDTcFDM1pJQ/QHNtFFJU2i8vcJPZqlJENFFgugaFq4TkMhbTdTaE/HxF5bSIxd39enNp7xkFWYotf3M81jtj5npLfALk9E3BlUjDHg5GQFHMrwDXfgcI3oV/i6+NZlT+ufg/aNN/d94n+ZtHqjVPkUpGaz2sOdoa6nGFFAsGxJq51YQH4eREF0pniPKtA2d2YCziMxWSMPalxtgOw3+YprKP/ipNJKCjjTeHxuhFwrkCrLw0oCUlqux1N9lVbZu+KIxPMLV7lF25bfXH5TFx9ta517GqxNBBQZMSd/47OW4C+8uoGxVtQlrcMUQa6PlbOP7Vejp4ZZoaiToutpHzQ9Ai5OneiGolEI4UjaV4K/KE8jE8qQrkCDyFSQ63s="));
                startActivity(intent);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=1S5ixviKf5iP26j7Dj2zpf%2F%2F%2Fw%3D%3DsAC7sn3PJivjoN85Dpq3gNA1oQ%2Bq3uPVegEXFqxb6qIE7sEIyYverJ95wrisAvS6hyX%2BDQQflKZ%2B5Nb%2FfazvY5RLnqWVKM21CuLFlph40oQh0PJDoXnlUDdM%2BGAZGLMZFXNKJ1JjwbgD9CY3%2BABqgk6ZgNCzhOJxtfBcKIeYEDIIxvHbhqpRHgLYTM7S%2BiU6Hy7WsjvL6fGBruqRzbSMBoQdLXoybizBOVFY0bnGAXBuAm%2Br0VTKtPC7lfKadmUos2oRsi5h8lWfd1Ql%2FKxMYW357AbsQ%2FiTmHrh%2BNSqgP47DpmNu2Rs3tEPrV0ZTODsbWqyaFa2xLbpwGCJChqMDqk5FTjhmpEKlE9YsTe%2BiBSbaPYaG5Ta0EcpydwDApABnfE1pd3w5hpzKIjEi8tAhLXbSE1G3rQrfSVhRDW7LYp0tlxwQ8Uss7QzVEPD8NnLiBFH6zBJn2Cw2Nn9osSZjobEwjz4PbgFc7ZRy%2FXU4dOykX4Lkg1xV9P8%2B9AZGSxw9fBETzoOaZqS7aK8kVEr%2BuYe8ZT6ORxXRcRboQbA%2BHDOMncXa%2FyAnrMYlfW7L9mX%2Bb1YQz8lBGKpqdNnEbcVbnWAI0wIp86hLD01MJ6YqYE%2B5PcsdixOKM84nfw%2BU7IK6gXbfDashjGWrFqHfIZZJp5bvHofAogLmASvWyOkvAPvrTkXXg8Yl2u3G21Iu%2FG1oy1Vhq%2FH77x9Zlr1IFzyuow%3D%3D&nvMid=82579114829&catId=50001994"));
                startActivity(intent);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=hqEwEwaQhNatcf33O8ync%2F%2F%2F%2Fw%3D%3DseYZ%2FTAv0wwGe3dqIEwjVT8ibfHl8z8heDz1UnHL2HSr%2F4Tw9wm3bpzpFa%2ByTui9VkK7PdwToxwMbAjNh5sPYCZTkz%2BU%2FlWTNqzfcvDoff2EeHZ5T6o%2FKOxB%2BF2EdwDbSqAuh3%2BnJnyL7jHQZUCi4iRWYo5mlXHaVtlE8U%2BPfKXfCOL3KMI6HhWBaCkg9x2TpRsCh5GS%2BklokEzA%2FJ0VszxCGSQdcrj%2BZJHLmJxgT%2Fbv7MrRFX13wsCyaGmcT%2FlY050Er26ouBAdCQKIWcUhyHUvDMSMBdZAhXVNmEi1%2FZhIdemHy%2BkET5ySGd5PlPEXXe6SCpstd1s6PUxCMYP5QHFg7gCbqmWxpcdI7rnSPXIU%2Fa18qhDQ1A%2FKJp3fgBDor391W%2FC1w5SVs2sYtTdFSeiYgQhNScgIULDS%2Bl7Y4GRZqLzcRVswO%2FNXTrA15l4GNFBtOCLpUN9ikKb0n%2F%2F9OYwtLKasywKe1E5d1VKyxXFlJB3Ckuu%2BtHmeODGYgKmiHwYJ3pLTShjo0gHXuW7cnwtaK7qjRbbetIwBcXtcSFdI2k9ocDCDwFctRzt24xPpQ1n8Qyssi7Dbd9N1aGEg2ZM80CHaZPun5q51E5V2WTMwc403F8KFTPJa4S%2BooMvNy0XJb4al2NwDkU2iUAbfspTocllCCMjxVKVs7VHzzMnYNUJgJp6CUXauCvW7Y5AjN&nvMid=24568349522&catId=50001994"));
                startActivity(intent);
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=Dil41bspQrDXeoAuGBR0E%2F%2F%2F%2Fw%3D%3Dsk4%2F4CBooHG2E2%2F4zR9sjwdSgplj9RbxWezXwps5kLNk7sEIyYverJ95wrisAvS6hYGsSQMNYpHSyA0PjQs%2FkuqOfu00m22DfhqIYIhgOYK50PJDoXnlUDdM%2BGAZGLMZFXNKJ1JjwbgD9CY3%2BABqgk6ZgNCzhOJxtfBcKIeYEDIIxvHbhqpRHgLYTM7S%2BiU6Hy7WsjvL6fGBruqRzbSMBoQdLXoybizBOVFY0bnGAXBs4LcXbjxEodupT7L2QcVFJ%2FHlnjlYYIlWJGltT4fLjlX57AbsQ%2FiTmHrh%2BNSqgP47DpmNu2Rs3tEPrV0ZTODsbWqyaFa2xLbpwGCJChqMDqgYtpdUVel04VPGFe4gGPaZAIHOjo%2B%2FN1mVsRgh%2F23zcfE1pd3w5hpzKIjEi8tAhLYruEL252P3O2GiqPHB2iJtxv2oAUbvokH9r1Aqg7dCnBFH6zBJn2Cw2Nn9osSZjoTozCV6vk%2BEIIkTeKOuQD8TVjdlMhl1kxhvw%2BJOd3yQTmXPehW3Bjyw8TgSQzFJDjSwwoE3bT30Boq7XQXlgYxrozVr3lUUO31BpvT0kKI5Xh8mc0BrL8EjA9KeRy2p1d13RYHBSqGxxdRYBEKnej5Wr7VAb36ErED7xDOmVlGU6JsKuvflhbn9a0VSSaSRGw3fuIPnmSNVfTWnEKCPJs1CPDTbIO%2FDPXL44UV8pqKWogqgOvq6z5EpEI5N2xav1Mg%3D%3D&nvMid=82831417680&catId=50001994"));
                startActivity(intent);
            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=NCZce9ilE5G5vvAIyGs7Wv%2F%2F%2Fw%3D%3DskrfgduaoeDcxHoEoFld8ac3ZDdoqi%2BKdFdSSQlvKwZMIzwF%2BlEOMxxN7wnCG%2FkkiLyUKUT4jcrvfYCUjPheYSDXJD0NsZoE8wg%2BLc2SvDZhHRaISaXjSXtxpkOUV9xcVv4epnNDTC4JNzxAHKfZQwTcKv7qWDMU7chCEnlzneBicbiajZsATW2Ida7hvLgqgGBPB910KBTz3BO9J8cC4Di9peYD2TYBahDqDUPAMsNrAmMgRcICfiS5F3GZpa4jfHOY2J9yGzKIlA8jaeUTY9mMjnQdnL9wtXZ1LI9BLQeEQhkkHXK4%2FmSRy5icYE%2F27dIBakKSC%2FecSFSX2ad%2FaS1BwuaQDzjtoYw6IYQSdClroiizyO45V%2FdjkYPn15PP9cqQAjL%2FidNgz8XniK09YxSGgPFt%2Bw8JkQPk%2FY7Yg57ksRLh8tejNdUWTVt0jkvoPrVd5RaoOb2SCk65%2F4UBb%2F%2FAEu3DmMTryRW%2FX8CioFeiemQKgeZJtOoLMgmPD6mMH0F8eVKb%2FwO4Jd8NwHwisIlGP9HzTbviPuYT168HU6NXe5q2p2HYtyyu78FiKDL4hb%2FWdRiqogwZQMmdK13BN6VUR4wd2u7D7KJNIunnLLp37lJ6hNA8TsQAG8EFUkpA2yiNJODlm%2BOHZIzX439kj9WGrLKo4l6oZ0BJjK1i1wTWCqA6%2BrrPkSkQjk3bFq%2FUy&nvMid=27342851283&catId=50001994"));
                startActivity(intent);
            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=TJpqEJ3fOKt%2F5maFz5a6Rf%2F%2F%2Fw%3D%3Dsa2oLzywb2XLJOw5zHkye5ZJ2Y9%2Fd0gmorUljDX02pyz%2F4Tw9wm3bpzpFa%2ByTui9VBkAlaSOxUTLtwcl23HocOjRW%2Bs6b6w0rbijbehKhUvoeHZ5T6o%2FKOxB%2BF2EdwDbSqAuh3%2BnJnyL7jHQZUCi4iRWYo5mlXHaVtlE8U%2BPfKXfCOL3KMI6HhWBaCkg9x2TprFRN%2BLM1yJAr78kyjmQeuVavFoQZioHQNBzgV6NBWA7ebhEtIZA7TL3Iul6BgUjzu7Yf2zb5w%2F5p7UxDFUR5xnjEuy1hVWr3jY99%2FsK%2FYaGAbCY81f975eS5nfR25FBiP83WAv8GAIoQ0MwLPWeb%2FbXuwo5%2FCixP8jaf2tYnC8vLZmbOrxe8oeOqyrnEYRjEWZmB1gM2cTS9n18H8JwrkRlCUwcBPeCXxfS2iFuasPRgK2GWfl9lTZMLbDD1NYA%2BIgOxllo9EII80mr4JPiaXVD6G1eKZilMgLKUkT0ClVjXaYErcotLmPjLAQ8FWgP1pxncKxG6xCkSp5i3ogE0P4V33DlrxosaYCNMR4x5rmZmKxk2a2tsUkUq10oBH9XrrBr0mWZyQNskAlQQa9x8QWEkuZoN3AU2I7Ga53a%2FRDGFMN7A%2BYUBImDEysKX%2BBifiGsoSqZRnfTw5fDqoVq3eEHQIiXcF4qwUXZ2sX76wW8%3D&nvMid=83009768069&catId=50001994"));
                startActivity(intent);
            }
        });
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=pkXXsBC9hsy3eWRqq0XgUv%2F%2F%2Fw%3D%3DsOvQNPm6QGJRMBphNYwLlDyx6vLnHuPLmXOiwo3AIySs7sEIyYverJ95wrisAvS6hdOeBh83qx1mNkQNS27o%2BMqlPvmrm4%2FZ2ceE2LseHcS10PJDoXnlUDdM%2BGAZGLMZFXNKJ1JjwbgD9CY3%2BABqgk6ZgNCzhOJxtfBcKIeYEDIIxvHbhqpRHgLYTM7S%2BiU6HD7ai%2BddhpxafE1inO1fd6VuIqOYHr7h4kDV4Uw6iZrXMtZ67xrm8y5LdTlLPwLhEBuogH%2B2zkeWmybFbQi46SMz3pc8jRS5rmIE5mEJVI3Fe3C7FtW0OIlDkYF2EXWwev1ocn7BRmCBZqSpY0yOgmUgAn8lD2%2BxrgblrBqYwPdWKx7G3krbJiQXzryuwwOqJJlht5MLE6ibytfsD1comCS0mIgIjWDo%2FFbqIqenL4QTqdi3Q%2Fm8V2A5jR123nAwZh34shjTl4w6eaWf9YN%2FIZI3eYTiFzp7XqS6RW03aO6%2BPLe%2BendjFblVuzwlHILWOe1hOa1KMgbaN21pOJOaDa%2Fr5VLfJcIie8VLOmG%2Byx8S2EI7i%2Fjcs%2BtTXVMHtvX%2BgUJbAu9H3Pmps%2FFGPZzLio8C8Ue37xRpyAeaFZH77E2lvVhDPyUEYqmp02cRtxVudOhlHPanSqJACcF14cbdrQ4OuAKV6RXG1Is03XJLviBdVtf5s714TmdBGBjdUocJ24fwofn7oClZEt3kyuD88VzocllCCMjxVKVs7VHzzMnYNUJgJp6CUXauCvW7Y5AjN&nvMid=26380268547&catId=50001994"));
                startActivity(intent);
            }
        });
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=nicg6AbFw5U9ltggAxzSGf%2F%2F%2Fw%3D%3DsMq%2BDfVmSNpLMEp9ux%2BxwRrznKtG08i5AzdLZvFJnxzwIzwF%2BlEOMxxN7wnCG%2FkkiGptTjZAHWbAXY0BXNpgONTXJD0NsZoE8wg%2BLc2SvDZhHRaISaXjSXtxpkOUV9xcVv4epnNDTC4JNzxAHKfZQwTcKv7qWDMU7chCEnlzneBicbiajZsATW2Ida7hvLgqgh4f3qmDCmpeItN5VsSXkj1aeSqBcWL316IxC9INy4%2FkPk%2FiqZ9tdAVML5plYoOjWX9yr3eRWyReWfiRWybU3T%2BCjO7KWumA7EKahqtQZSPWUkD%2FGjbTvsnnC62m2VkaB5WQSa%2FaYWyMJ8xxptKAK2rIsgOKjgJofxFuAZ0sodtMZEdc907xQLn3Dm1Kl00lWIfoGJ7s17Necdj3JUB0Ys357AbsQ%2FiTmHrh%2BNSqgP47DpmNu2Rs3tEPrV0ZTODsbWqyaFa2xLbpwGCJChqMDql%2F6VojIrVU%2BOvUi2HFrw1b7gmP4slEX3dTQw0aq3klWEGg3us%2BZTDAbMF9t1Gy9ru8Tbj6qFVWVyXGlUOMxEP1GNU0QRPojsMyokyQ%2BiqjEnOPQmXvrq8xOanUNmTNCxPE63wYnuszdRuSL7TvtACfclF3aEO%2BZHJkIIODuvJaM5%2BpVqqGYancnDBB3yxSS2aUQ9v6a7kq11kXYJ6bkfYGsu2Sx92LHkLKrLD3FLIyNiPnXg18oo5xYZCWILFrQOoOuAKV6RXG1Is03XJLviBeJpP3%2FoObZR4NNojA8F4ntigSSUJkUBvp87sZzSq5wh29TZjqEQTAbFzUBl8432wvhVEAf6wwM5tqtSh0bB5Hx&nvMid=23597267027&catId=50001994"));
                startActivity(intent);
            }
        });

        return view;

    }
}

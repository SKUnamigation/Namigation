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

public class FragShampoo extends Fragment {
    private View view;
    CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8, cardView9, cardView10;

    public static FragShampoo newinstance() {
        FragShampoo fragShampoo = new FragShampoo();
        return fragShampoo;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.frag_shampoo, container, false);

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
                intent.setData(Uri.parse("https://adcr.naver.com/adcr?x=D/aUZG0czexs/lGLr6ItVv///w==k/OabqtRMBuT7k3Mki0F90P2JGzcHXSsqrp6jzTGuyQLchklTT0wo0LRuwbVFsNdk3ClhN+WUWly7G3J99kFz+jCyB+gsQyiDxODghUvbyRmfSy+aHrsb8mbeYXHfb6rpROpnn40d6kfxPmm3pBvDVcztaKZMZqOPsB9ktg9VemvyHVYqoVzYphdIiSX2UummXAQZyMiSuLqg8NfpiXm6DVuWFJEKCm/k0GCIGdEU9tzRXn8a1B3MIQngQYZyBN7ALGrc5ZYL6BcfdpSvGsMYtmB4HZmkDrroT2U/M/Xfvj56F6iA9uiOSBqZAqwUKs52UKHIeaPw8vEPWjxriNVL1kFHXld5dp0+NalgPIPFn0ALDmeVnNq8Ge63+sTV49lb85sL7tO1j21uyVqQF+oYvqLiKahZtU+bh4wPxTaFFne3qiOB1ixcCUk327EcZyfiE0HhOjqX+O7f0ia0Kv9eCD9+etbKZfW806HRobLzgvPFzOsEU803MLMAuQzHXlium+Si8SHcshZehSRWkU/cqorgGZia+GGOINXQcGdq3iRhAAu0vsOV1xoO347ZM3vWOa0Ojq5EH/P9N3LySe1UaclkfU/U1Gc/pQPob4OGPsqA97QgMenhO1rFPr3XcAJOw6fO7m9N5iE0ahtjHHR5lEJt4d3Co+h8BhfZ44PR4KDVTpjoo9p3bOAs388wSaNbgV/9+9Uzfng9ZaHgCm5UyqB0zuzUV83nSBdL+SMzNtjGEPINEINiKtGSTxxXrJ9iKxm42FsAbpYSTSB6aZ+LB3wkWtIByt2457xdcDmOKcC9hFAgBw66oeYnGdqw2VwYOBr2w+9WuhNNe6Ko6XCFwvKqFzTuq/ZaFhRo0UXxH1dl/CSybvv9i2OsCp6Hc0Xebe00x9FED/JrDJjRk9McN6LzoxAByWOSOGH+0bev2bo="));
                startActivity(intent);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://adcr.naver.com/adcr?x=SnCqDCWXJ0U9W3f9ylv5w////w==kvRCaAd2fSTKNQUcd1Fh+M6M8FnG4YF7DFcLq9uRyRFyvIsRMMafe9R+MPhXmSz1dd3BTH0ZhNQnG/mDL5ngaqhfdyllLpcbkMiwkJhoW8htAvAx2oWdfLM0aPb6pp133N70YHQotgwFqOSMnr+L7l0qvD0MACRpHHwG/451LUxbgStjzePJokFkO2KIbSCIlC8tIITsekT1wQevuEj++AXDao4/3h81SQSO1Y4hU1bhJAmjpt5n8jEpXg9P5xdgLCEVDegRwyZ1YKtqxIAgIyZs7H/JGsWCcR9IeZAnkR/NEPFbi6knKRA4kB2AugKoSBwtE0UUBT7RLo/x8WP2dtc7aG0xdRp0xIlewXncnglwiVZLNEpfzEXIxIVM0o4oAUmLqhk/ZLKxbieHxf/IbhUZLprw5hQIUE4MENC31SbW0rKaVAEFE17AqMLTaaV78dB92H974Al0zVyS38CuNpuC7z3ae4RlX57lgLNiEA0h0JRLcQeK3aSlCdLgcJkCrfdz/6F/Z2DMHfNWhAw4D+JHckkCU/IiLadGftcpWcUIgf1vshO+7AyMhPN1+0nzldkCnP2eX2KtIgEMmrxDirppPhireOU4QXMcvdyQ/zvG7d6eX4+oyoKpjJDwNN8SIWymX0leUBX4njdBPOR/RnWbT/dVHpq132rUmT5ehIiqBnHprSPcXbF5994pvwo+154YGxDWaj3RyYgyTeEos68XyG3UlsUEGha8h0fCvSSzF+afzF/Dp9EDHEqE8Q0q/Agts4dgTmWwzANQCTQJlHUSKc9gAXNM+OAja3iaGKa7xi0rfElPgtjkRWs+MGUVwTQ+1Upl5t3zrgbRNhP9qlvrbwUrC+GGsojss0Gih016Daj2sasvGhgFdnO/JazQj"));
                startActivity(intent);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://adcr.naver.com/adcr?x=xv1yKd1pcgy5cDHzoxo8uf///w==k2OpVS/QDbVe1CHqLX9E1ybOHbSipNMKvjQCAcOy+ZbT/Ea/gKxauoqQaYuO/UmkF6t4Hwv6ehjybUqGPvKWEot8XVrMluWpuhDJN89WuOwRKwUTVIeSfSb0DIy6ioHI8HyOFVKm+59k/1N84J9EoLddoP2RCheKPb+qqUBLRFfA0Jr2Bke81Vaungm0VBr604bkOH0G69wUeMx6+WJdCdn3IzlOi84NOZdzHzlxssjq7TqpGKOCoJ2OPVUynnKjT1pkCt3iBFBX/L2Ty3wIh2f7/1dpOXeFIgKBqMTPP+XJPoeU9XK+gSVAGNBRWLAbJ7K10gm7pYH73HjSBBtRvyEeKNmf6MAtMfsrv+fnXFeCG6CCysyPgmLxgK7p/ZhF2SLewjItaNzEOJ8w7CsyDCu7xx3t8uLNia8x85XCb4SMFLtY2dGCMJI7uQ+4yxEGRLgGz/hRUhldkXOI9e45zACqP2RmCOQBDbHTc811XifxEIxriRnpA/modF2HD3AnCR3lXIBMtCvBcRqbMuWu5ja06UjfrhrREWnFRMjSe9AEbP7TcibBGGbfu4EJJrEe5pxn8L9HXt74ARQ73FC33fCZ4EI2NShOqNTYtcDmBs9pvYIBmAtzcJrTYngkqhiCZ/nuj1xl3J7CtNhA3Gpuog+mFIBcqy1CpfrGzAx1E0D7nFE3LvDbUWfNS2A4H8s6yXFwgyqMB71sNmGuYGg833GJXgTGiO4GESXKo/BLN7UTbxIQ4YjRBsmXrIndc58xMbjP+Ob5VA8+mKUmuju47ekww+DtXf2Fo83XD8uTQ6C2TGKqX7XquXaRyJ4i+TG0aHHW6qQpXGgFFpTp6kRn4grHffEEMVCgKgUYe6ePlRzw="));
                startActivity(intent);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=NZFyArWVEpKJ1aWBYZL%2FCP%2F%2F%2Fw%3D%3Dsa43Wgx5D9E0R9s4CXmF4GCE0uMMHrRKhf4EePm4acW62G2zDjKuXvj1RXMfL3b7l1NVadS%2B7OzwKZN5tj%2BUeuj%2BnzmjfqrbUUxEMdlLXoJhVXemfpmeX70wC2wQT5nyiBte2Da%2BcRSMmzTx7XU%2B5wF682l%2B3kBeuK2eQNxC4aGvtTgSOqyREaLLHZmVdCE4jYZZsLAMOaR%2BTYxoDYszzoUPg%2F6PYJW9LpCSumzPJoiiI9aZyW4hhCgmcrsQhWGWGmL0AuCf4RWdSsT7%2BuW2dEYc8%2Feyl3KfQRfciaXqbyPvdD0%2Fne4lE%2BCNxm6KYX%2BJ7BRHRqaoNn3Tmzf%2Fx4oRrS00NP9HDDndRYZb81H2bHtKGZ5a0ma%2FDwz3QQr7PLlrXJV03cukp%2F9sq6JmLvPVclHPZl%2FbZTfqrUKASbHkj9Pb%2BJgu0Lq8E%2BGejGXx%2BmPGFSo0adg%2FaZAYXCXaj0Al5E2eq77bF2HiidzP6q8PGYcznchUd7EkoifJW3dC6NFt1GYf6DIw2YDk5dgBgMcFBbcDdbmulHZpwzWSmcL%2BsvNNMTh8QqrfxM0XjeBQWHiwEjjwGtlO24DjUwjweQSl75aawhpuBTEN0aMZnzX77lno4RHGsy8yqM4gCP7XBv%2BPW71tqtWQablf%2F77SlIExh55K%2BIwiC%2FMdnaO%2B9zQMKbib5Li6iMhKFni13GfhxjpVlb1NmOoRBMBsXNQGXzjfbC%2BFUQB%2FrDAzm2q1KHRsHkfE%3D&nvMid=18979532435&catId=50000304"));
                startActivity(intent);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=9nivUpT8GQsgSfMy4CpJ1P%2F%2F%2Fw%3D%3Ds%2FD%2FJTV0knZKjxOvln43Wbd%2BiZT7Xwbd0KU9SquTMrjb3ZNYoOxbRthMlS8ixB8quhHMYXVQUVh7iZ6tSoy9yxB4pza8ebIOIXPrPsGGS95ek6v2w9jBqMGR4TTsgYaQnqO7llcvdB5pXUYBj3J9tTQQ3c9vtsAzUwO7etlWaKy1h1yLmgzS4wXijuyUzdu37fprxZkb6qq9Vm94rGbANN%2Ba0O2TX7GIDZW3de8vjU8zFq18e62M9gzvqRMrCxOpQWacpy8nHrghfWhrTUG89uxz1O1%2FiPlHfZMPkqfHG49Lffisv5tHfoGFh7RH%2BtSaOAFJNLWxG%2Fj2gEfGb7GroeMmG0KU8dB0sylzFpScu1u05rc3teUqlB%2BYYXu6qme%2Fb5adVVOd36sZSkwU%2FrusCgp%2Bxz26kvub3jXhGtusX8zo03v5appo5bhR9hNbJcy8wBFH6zBJn2Cw2Nn9osSZjofIcOlgRalFSlTR4wBig3iwAz3%2FTVg95bgodulb1P9WyTqk4DbY6bqmJYSLFYZsKfVeMtyQ%2Fd6CDjCvibviHeGXrGUOirw0Ez7Y%2BpzOF9QQPPC8UvqGS9Ar%2FDD8X5NQ7q%2B%2BqSESUbp26%2FYODYC3kDp8WE0qs4H%2BdU2vaX8Iv2wVNZSMsvaOZS08e3PJgSgD83KZVbE8B%2FZMidTCXyuDcxbqDrgClekVxtSLNN1yS74gXs23CB35KcpTDbqDMgiq3oO3ksLNTMHbzNnV0VvlxqWB0FQgae74ha5xwnjeM2LnlaGimR4pR27mrh1IoDTOSgA%3D%3D&nvMid=81872717144&catId=50000297"));
                startActivity(intent);
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=vuQNarnPEu4LrDziyOq7Af%2F%2F%2Fw%3D%3Ds5bfSlTWyVFivlw5K8MSmLYAv0D7ftzAg2Avm7b%2FZaQqqVhYm9C1ghrsFJxXunUZRWeBGJU2Bcm0PdSvFGP8e9tckXOT%2F3LAxl9LO8wQZPi254J8UO7LDGXdPU9Do8oyM%2BUMsZr7MfVU%2B4cFbJufs9SwNyJ6jFZxsJJNDWvBk9plmRZlS%2FNE4Jjxz%2FQBILBK3cAP73P6Q7RmJjkfn4H3ejsOmY27ZGze0Q%2BtXRlM4OxtvQ%2BYXXK17juKHL1QmK8ZAnPuyPfp6r5vMIzFCIH8i1rKpITS7H8YHo6ICeOE3hGpuAaKDGOK%2BSceVquUYNIYbTw3IWMIhaaRAXdxqueeMWhz1O1%2FiPlHfZMPkqfHG49Lffisv5tHfoGFh7RH%2BtSaOAFJNLWxG%2Fj2gEfGb7GroeOG%2BPagyNyy29yokWAIGQRbdHSEmJQnF93moGWKmKfkQ5adVVOd36sZSkwU%2FrusCglWOr%2Fa0T89skwjXNZTbSVvI5QZafemmH5%2BUOvPbrdkUdgA%2BMBZ6EeN4BDscL4YQyW3M8vjPTBWPUPQOgKyD5fzxpqm3v9bGR37jAJ4D%2FK4%2FrKueoDvJWMEb4g8wkrW53ML36STnny8iCdnWaqrflvdBoiuENiS1Np1bYD6EZ0c1ramjBwCZI9AwCV4mCTWQmSeQQ%2B%2FWXNvDIjeVdz9gRpCxlzDupU0ynpVv3quv7N0qVoWd0jB03C5aYq3HUc1IKtSSLJQZncWk8e8Ttfjz6Fs%3D&nvMid=12459610226&catId=50000297"));
                startActivity(intent);
            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=L%2Fy6qabEUfyUt6wJ5TLm7P%2F%2F%2Fw%3D%3Dsked%2BE%2Bx1pIKPH6Bo70XrzRMsc8o2mSUU6hySPNIIm3j3ZNYoOxbRthMlS8ixB8qumPYNOzHYHGojE826s%2FqNkR4pza8ebIOIXPrPsGGS95ek6v2w9jBqMGR4TTsgYaQnqO7llcvdB5pXUYBj3J9tTQQ3c9vtsAzUwO7etlWaKy1h1yLmgzS4wXijuyUzdu37EFbY7YHVgORT5kppfinBJYBsJjzV%2F3vl5Lmd9HbkUGLSvP4ko%2Fja249gCaMcSCZZNQr42YvR%2FmTlmx%2FOJwa4f%2BsWxYX7JJqap2SfNzfEL9ZDMmBQB6eNB8A3ekrtIxBkhbpNHAfAGjvlbHalSHlRRODb%2FDznwrDsID9A9QdWi3DL%2Fowdnq7%2Fmfq67OVRzok0S5SJNLgIdS1XFCtZ5GETGCIHkiOHHqvhL5GSuF%2B87Ug9Z0SeMqENQcl4GV2BeGrF8f9BpIH7JFCM6x5Qw0PSN%2FIddYwWz2O%2FDr7Hzv8tt51gK2GWfl9lTZMLbDD1NYA%2BfpmIglOGMtKQRE7zF%2BOG7cQaGOOP8XTZZ6ldu2JKpP7Ip7N7IuPDQTCOx3BvgF1017OlDAfaOo%2F0dbutJwdhuWopAPPrayfwPnK1Lm8P5o4IeskyYPv%2F%2FmKmmS7kRtWcKsMthf%2BgKJLAD5qys8%2FpPa2powcAmSPQMAleJgk1kJnaXRYKxNggOcI8dmhTgarOO%2FY8QLK5gZpdPWMLlNdeVFaFndIwdNwuWmKtx1HNSCrUkiyUGZ3FpPHvE7X48%2Bhb&nvMid=27147113522&catId=50000304"));
                startActivity(intent);
            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=SBoZbnwR5f%2Fos2H51uI0m%2F%2F%2F%2Fw%3D%3DsYVfJMecmdEBQmvPkYR7oiQHzkMJNip6l3zxBW7LyfCGqVhYm9C1ghrsFJxXunUZR6UJQogp7nDxAX3%2FIfH3J4jRW%2Bs6b6w0rbijbehKhUvq54J8UO7LDGXdPU9Do8oyM%2BUMsZr7MfVU%2B4cFbJufs9SwNyJ6jFZxsJJNDWvBk9plmRZlS%2FNE4Jjxz%2FQBILBK3cAP73P6Q7RmJjkfn4H3ejsOmY27ZGze0Q%2BtXRlM4OxtFSICBvI1ATDFN58yC%2Fe2x%2BwXcFuw1I6AEhg9%2FPcitybKpITS7H8YHo6ICeOE3hGpuAaKDGOK%2BSceVquUYNIYbTw3IWMIhaaRAXdxqueeMWhz1O1%2FiPlHfZMPkqfHG49Lffisv5tHfoGFh7RH%2BtSaOAFJNLWxG%2Fj2gEfGb7GroeDRb5mm0Hi1r4o62qengP4HLLhykLf4966ZVHVV%2BnVU15m%2FzZ4dXrpFXWdiQZEBf47wSvW2di%2BSLaUXYgg3YcBk3lBcvaPCbuF2jfGiQTrV9dgA%2BMBZ6EeN4BDscL4YQybOIwlaYyewSJ5NwVSWccqPdHMmSmXVJIdFQZkaDDYlBiLeTAzN2z9Ad6wvxD9fxhvI0fIFRfBZUPaSLRPGc3PIVr94Fju1c85naEq8baIdy9xkAXFfTyZtkcYRMmBa%2BJb%2BGBoyQkiFtSLwcV09cBvdpawH1mbUxiU%2BPfWw%2FtwKg84L%2F7xRDKITv0T23FtNbCQ4SwcLvxUEucVmH%2BcOht40%3D&nvMid=24862244522&catId=50000304"));
                startActivity(intent);
            }
        });
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=lyw91jeRfEP4UzzUczilff%2F%2F%2Fw%3D%3DsfWnUX7UUH85lWyXybqcrWNNbiIOw2Q2TZQbjpe%2BPUJaqVhYm9C1ghrsFJxXunUZRYbXPY4Ql5rptdZ7G6lLJsv4aa%2Fv2S%2FC2g%2F0Rinj9vEq54J8UO7LDGXdPU9Do8oyM%2BUMsZr7MfVU%2B4cFbJufs9SwNyJ6jFZxsJJNDWvBk9plmRZlS%2FNE4Jjxz%2FQBILBK37mZtyUZIyVm7lB%2FFW%2FZA9Lzg5LotibZWs96FaOW7%2BneOP0oYFbr1kQPfR4PYNcaQlVXo%2BB35zpvV%2FeG8qF3%2FXk0NP9HDDndRYZb81H2bHtKGZ5a0ma%2FDwz3QQr7PLlrXJV03cukp%2F9sq6JmLvPVclBnSNxuyTvYJL%2F9lzjmb%2BVkNDWMfQU6dQz2TPWues9C7f5S5ycDGuwbfEdv1A6kKwu9jRmwUSss5omKwOwicLN%2Bn0bblEcLXXlpsCXKobe30GYf6DIw2YDk5dgBgMcFBbUqXUmL1WDtqbKsw%2FdAw12H44Bdd0R7dQi6RGSVYtbpllu6Y2%2B8HOcCuMOtp0bXXu6iDF0R0PsORtsby9avkzN8CrxadeEbTHcqYQK2EaLJxSTuWibkLJRw%2BoDldg0A%2Fgshcqw68nuluFLF5roO%2Fn8700gTY5ZCKdUxOCR7K5yzGB4a5uj6n4SvMeSpdC8EOy1dznR4EhPC6BI08fc6TT2xWkbDrUFJ2hBG8QaB8WVzn&nvMid=83010831649&catId=50000304"));
                startActivity(intent);
            }
        });
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=cY5o7DfRPXVGqLsmu%2B1Fdf%2F%2F%2Fw%3D%3DsLvvmJWeZfImBDUCKRLKT9vtri3VGRf6h6RGr9wnroii2G2zDjKuXvj1RXMfL3b7l6Mfrnt%2BzoD9dCN91BuZEzWb815EzvH4%2FL6rIUBFNbgtVXemfpmeX70wC2wQT5nyiBte2Da%2BcRSMmzTx7XU%2B5wF682l%2B3kBeuK2eQNxC4aGvtTgSOqyREaLLHZmVdCE4jYZZsLAMOaR%2BTYxoDYszzoUPg%2F6PYJW9LpCSumzPJoiiI9aZyW4hhCgmcrsQhWGWGWIchTEhys706fcA0chnJtoc8%2Feyl3KfQRfciaXqbyPvdD0%2Fne4lE%2BCNxm6KYX%2BJ7BRHRqaoNn3Tmzf%2Fx4oRrS00NP9HDDndRYZb81H2bHtKGZ5a0ma%2FDwz3QQr7PLlrXJV03cukp%2F9sq6JmLvPVclJeueHyTxEu5Ru8NwV0uiRqoE%2BZASiGUTQAo2sPKJpafSo0adg%2FaZAYXCXaj0Al5E6E6VwTbtIRq2uVlFZLXKszF05%2Fx3P%2BRrCuzq2l%2BVS%2FSGYf6DIw2YDk5dgBgMcFBbT76949OELocDTGncYhP07AW%2B3YP9Xs3S0n9mLnRYKB47eh0RmeheGNVGZ7DNQpWwIoyvAwmUrMMSyHwT0j7p21lIDVYdPwbP7UjMwo4F7R2IGQbAJg0HYtfOwZ6gCxN546%2F74bs%2FzNmznhIO5N5zjX%2FEXlFGIvfgTebv80Hjm0GtKx%2Busxlj8oAG7%2FVqbY1%2FMtVYavx%2B%2B8fWZa9SBc8rqM%3D&nvMid=23803224523&catId=50000304"));
                startActivity(intent);
            }
        });

        return view;

    }

}
